package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.Map;
import eu.quanticol.jsstl.core.formula.*;


public class formulaScript extends jSSTLScript {
	public formulaScript() {
		super( 
			new String[] {
				"LightInputs.displayNone",
				"LightInputs.displayRed",
				"LightInputs.displayYellow",
				"LightInputs.displayGreen"
			}
		);	
		
		//req1 = LightInputs.displayYellow
		addFormula("req1", 
				new AtomicFormula(
						new ParametricExpression() {
							public SignalExpression eval( final Map<String,Double> parameters ) {
								return new SignalExpression() {
									public double eval( double ... variables ) {
										return variables[getIndex(2)];
									}
								};
							}
						}, false)
				, null);

		//req2 = F[0, INF](LightInputs.displayYellow)
		addFormula( "req" ,
			//new NotFormula(
				new EventuallyFormula( 
					new ParametricInterval( 
						new ParametricExpression() {
							public SignalExpression eval( final Map<String,Double> parameters ) {
								return new SignalExpression() {
									public double eval( double ... variables ) {
										return 0;
									}
								};
							}
						} , 
						new ParametricExpression() {
							public SignalExpression eval( final Map<String,Double> parameters ) {
								return new SignalExpression() {
									public double eval( double ... variables ) {
										return Double.POSITIVE_INFINITY;
									}
								};
							}
						} 		
					),
					new AtomicFormula(
							new ParametricExpression() {
								public SignalExpression eval( final Map<String,Double> parameters ) {
									return new SignalExpression() {
										public double eval( double ... variables ) {
											return variables[getIndex(2)];
										}
									};
								}
							}, 
							false)	
					)
			//)
			, null);
	}
}

/*
package hu.bme.mit.gamma.tutorial.extra.monitor;

import java.util.Map;

import eu.quanticol.jsstl.core.formula.AndFormula;
import eu.quanticol.jsstl.core.formula.AtomicFormula;
import eu.quanticol.jsstl.core.formula.EventuallyFormula;
import eu.quanticol.jsstl.core.formula.EverywhereFormula;
import eu.quanticol.jsstl.core.formula.GloballyFormula;
import eu.quanticol.jsstl.core.formula.NotFormula;
import eu.quanticol.jsstl.core.formula.OrFormula;
import eu.quanticol.jsstl.core.formula.ParametricExpression;
import eu.quanticol.jsstl.core.formula.ParametricInterval;
import eu.quanticol.jsstl.core.formula.ReferencedFormula;
import eu.quanticol.jsstl.core.formula.SignalExpression;
import eu.quanticol.jsstl.core.formula.SomewhereFormula;
import eu.quanticol.jsstl.core.formula.SurroundFormula;
import eu.quanticol.jsstl.core.formula.jSSTLScript;


// @author loreti

public class BSSScript extends jSSTLScript {

	public static final double Tf_CONST_ = 40;
	public static final double k_CONST_ = 0;
	public static final double dmax_CONST_ = 11;
	
	public static final int B_VAR_ = 0;
	public static final int S_VAR_ = 1;
	
	public BSSScript() {
		super( 
			new String[] {
				"B",
				"S"
			}
		);	
		//phiB = (B - k_CONST_)
		addFormula( "phiB" ,
			new AtomicFormula( 
				new ParametricExpression( ) {
				
					public SignalExpression eval( Map<String, Double> parameters ) {
						
						return new SignalExpression() {						
									
							public double eval(double... variables) {
								return ((variables[getIndex(B_VAR_)]) - (k_CONST_));
							}	
												
						};	
									
					}
				
				} , 
				true
			)		
			 ,
			null );
		//phiS = (S - k_CONST_)
		addFormula( "phiS" ,
			new AtomicFormula( 
				new ParametricExpression( ) {
				
					public SignalExpression eval( Map<String, Double> parameters ) {
						
						return new SignalExpression() {						
									
							public double eval(double... variables) {
								return ((variables[getIndex(S_VAR_)]) - (k_CONST_));
							}	
												
						};	
									
					}
				
				} , 
				true
			)		
			 ,
			null );
		//phiTest = S[0, d]phiB = S[0, d](B - k_CONST_)
		addFormula( "phiTest" ,
			new SomewhereFormula( 
				new ParametricInterval( 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 0;
								}
								
							};					
							
						}
						
					} , 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return parameters.get("d");
								}
								
							};					
							
						}
						
					} 		
				)		
				 ,
				new ReferencedFormula( 
					this ,
					"phiB"
				)		
			)		
			 ,
			null );
		//phid0 = S[0, d]phiB && S[0, d]phiS = S[0, d](B - k_CONST_) && S[0, d](S - k_CONST_)
		addFormula( "phid0" ,
			new AndFormula( 
				new SomewhereFormula( 
					new ParametricInterval( 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return 0;
									}
									
								};					
								
							}
							
						} , 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return parameters.get("d");
									}
									
								};					
								
							}
							
						} 		
					)		
					 ,
					new ReferencedFormula( 
						this ,
						"phiB"
					)		
				)		
				 ,
				new SomewhereFormula( 
					new ParametricInterval( 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return 0;
									}
									
								};					
								
							}
							
						} , 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return parameters.get("d");
									}
									
								};					
								
							}
							
						} 		
					)		
					 ,
					new ReferencedFormula( 
						this ,
						"phiS"
					)		
				)		
			)
			 ,
			null );
		//phi1 = G[0, Tf_CONST_]phid0 = G[0, Tf_CONST_](S[0, d]phiB && S[0, d]phiS = S[0, d](B - k_CONST_) && S[0, d](S - k_CONST_))
		addFormula( "phi1" ,
			new GloballyFormula( 
				new ParametricInterval( 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 0;
								}
								
							};					
							
						}
						
					} , 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return Tf_CONST_;
								}
								
							};					
							
						}
						
					} 		
				)		
				 ,
				new ReferencedFormula( 
					this ,
					"phid0"
				)		
			)		
			 ,
			null );
		//phi1bis = G[0, Tf_CONST_ - tw - 0.1](F[0, tw]phid0) = G[0, Tf_CONST_ - tw - 0.1](F[0, tw](S[0, d]phiB && S[0, d]phiS = S[0, d](B - k_CONST_) && S[0, d](S - k_CONST_)))
		addFormula( "phi1bis" ,
				new GloballyFormula( 
					new ParametricInterval( 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return 0;
									}
									
								};					
								
							}
							
						} , 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return Tf_CONST_-parameters.get("tw")-0.1;
									}
									
								};					
								
							}
							
						} 		
					)		
					 ,
					new EventuallyFormula(
							new ParametricInterval( 
									new ParametricExpression() {
									
										public SignalExpression eval( final Map<String,Double> parameters ) {
								
											return new SignalExpression() {
												
												public double eval( double ... variables ) {
													return 0;
												}
												
											};					
											
										}
										
									} , 
									new ParametricExpression() {
									
										public SignalExpression eval( final Map<String,Double> parameters ) {
								
											return new SignalExpression() {
												
												public double eval( double ... variables ) {
													return parameters.get("tw");
												}
												
											};					
											
										}
										
									} 		
								)
					, 					new ReferencedFormula( 
							this ,
							"phid0"
						)		
)
				)		
				 ,
				null );		
		
		//phit0 = F[0, t](phiB && phiS) = F[0, t]((B - k_CONST_) && (S - k_CONST_))
		addFormula( "phit0" ,
			new EventuallyFormula( 
				new ParametricInterval( 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 0;
								}
								
							};					
							
						}
						
					} , 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return parameters.get("t");
								}
								
							};					
							
						}
						
					} 		
				)		
				 ,
				new AndFormula( 
					new ReferencedFormula( 
						this ,
						"phiB"
					)		
					 ,
					new ReferencedFormula( 
						this ,
						"phiS"
					)		
				)
			)		
			 ,
			null );
		addFormula( "phi2" ,
			new GloballyFormula( 
				new ParametricInterval( 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 0;
								}
								
							};					
							
						}
						
					} , 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 30;
								}
								
							};					
							
						}
						
					} 		
				)		
				 ,
				new ReferencedFormula( 
					this ,
					"phit0"
				)		
			)		
			 ,
			null );
		addFormula( "phi3" ,
			new EverywhereFormula( 
				new ParametricInterval( 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 0;
								}
								
							};					
							
						}
						
					} , 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return dmax_CONST_;
								}
								
							};					
							
						}
						
					} 		
				)		
				 ,
				new ReferencedFormula( 
					this ,
					"phi1"
				)		
			)		
			 ,
			null );
		addFormula( "phi4" ,
			new EverywhereFormula( 
				new ParametricInterval( 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 0;
								}
								
							};					
							
						}
						
					} , 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return dmax_CONST_;
								}
								
							};					
							
						}
						
					} 		
				)		
				 ,
				new ReferencedFormula( 
					this ,
					"phi2"
				)		
			)		
			 ,
			null );
		addFormula( "phi5" ,
			new GloballyFormula( 
				new ParametricInterval( 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 0;
								}
								
							};					
							
						}
						
					} , 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 30;
								}
								
							};					
							
						}
						
					} 		
				)		
				 ,
				new OrFormula( 
					new ReferencedFormula( 
						this ,
						"phid0"
					)		
					 ,
					new ReferencedFormula( 
						this ,
						"phit0"
					)		
				)
			)		
			 ,
			null );
		addFormula( "phi6" ,
			new EverywhereFormula( 
				new ParametricInterval( 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return 0;
								}
								
							};					
							
						}
						
					} , 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return dmax_CONST_;
								}
								
							};					
							
						}
						
					} 		
				)		
				 ,
				new ReferencedFormula( 
					this ,
					"phi5"
				)		
			)		
			 ,
			null );


		addFormula( "test" , 
			new GloballyFormula(
					new ParametricInterval( 
							new ParametricExpression() {
						
								public SignalExpression eval( final Map<String,Double> parameters ) {
				
									return new SignalExpression() {
								
										public double eval( double ... variables ) {
											return 0;
										}
										
									};					
							
								}
						
							}, 
					new ParametricExpression() {
					
						public SignalExpression eval( final Map<String,Double> parameters ) {
				
							return new SignalExpression() {
								
								public double eval( double ... variables ) {
									return Tf_CONST_-parameters.get("tw")-0.1;
								}
								
							};					
							
						}
						
					} 		
				), new EventuallyFormula(						new ParametricInterval( 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return 0;
									}
									
								};					
								
							}
							
						} , 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return parameters.get("tw");
									}
									
								};					
								
							}
							
						} 		
					), new AtomicFormula( 
									new ParametricExpression( ) {
										
										public SignalExpression eval( Map<String, Double> parameters ) {
											
											return new SignalExpression() {						
														
												public double eval(double... variables) {
													return (variables[getIndex(B_VAR_)]);
												}	
																	
											};	
														
										}
									
									} , 
									true
								)	)),
			null
		);
		
		
		
		
		addFormula( "psi1" , /////CORRECT!
				new GloballyFormula(				
						new ParametricInterval( 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return 0;
									}
									
								};					
								
							}
							
						} , 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return Tf_CONST_;
									}
									
								};					
								
							}
							
						} 		
					)	, 
					new OrFormula( 
							new NotFormula(									new AtomicFormula( 
											new ParametricExpression( ) {
											
												public SignalExpression eval( Map<String, Double> parameters ) {
													
													return new SignalExpression() {						
																
														public double eval(double... variables) {
															return 1-(variables[getIndex(B_VAR_)]);
														}	
																			
													};	
																
												}
											
											} , 
											true
										)		),
							new SurroundFormula(	
									new ParametricInterval( 
										new ParametricExpression() {
										
											public SignalExpression eval( final Map<String,Double> parameters ) {
									
												return new SignalExpression() {
													
													public double eval( double ... variables ) {
														return 0;
													}
													
												};					
												
											}
											
										} , 
										new ParametricExpression() {
										
											public SignalExpression eval( final Map<String,Double> parameters ) {
									
												return new SignalExpression() {
													
													public double eval( double ... variables ) {
														return parameters.get("dw");
													}
													
												};					
												
											}
											
										} 		
									)		
									, 
									new AtomicFormula( 
											new ParametricExpression( ) {
											
												public SignalExpression eval( Map<String, Double> parameters ) {
													
													return new SignalExpression() {						
																
														public double eval(double... variables) {
															return 1-(variables[getIndex(B_VAR_)]);
														}	
																			
													};	
																
												}
											
											} , 
											true
										)		
									, 			new AtomicFormula( 
											new ParametricExpression( ) {
												
												public SignalExpression eval( Map<String, Double> parameters ) {
													
													return new SignalExpression() {						
																
														public double eval(double... variables) {
															return (variables[getIndex(B_VAR_)]);
														}	
																			
													};	
																
												}
											
											} , 
											true
										)		
									)														
					)

					)
//				new SomewhereFormula( 
//					new ParametricInterval( 
//						new ParametricExpression() {
//						
//							public SignalExpression eval( final Map<String,Double> parameters ) {
//					
//								return new SignalExpression() {
//									
//									public double eval( double ... variables ) {
//										return 0;
//									}
//									
//								};					
//								
//							}
//							
//						} , 
//						new ParametricExpression() {
//						
//							public SignalExpression eval( final Map<String,Double> parameters ) {
//					
//								return new SignalExpression() {
//									
//									public double eval( double ... variables ) {
//										return parameters.get("d");
//									}
//									
//								};					
//								
//							}
//							
//						} 		
//					)		
//					 ,
//					new ReferencedFormula( 
//						this ,
//						"phiB"
//					)		
//				)		
				 ,
				null );				

		addFormula( "psi2" ,
				new GloballyFormula(				
						new ParametricInterval( 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return 0;
									}
									
								};					
								
							}
							
						} , 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return Tf_CONST_-parameters.get("tw")-0.1;
									}
									
								};					
								
							}
							
						} 		
					)	, 
						new OrFormula( 
								new NotFormula(									new AtomicFormula( 
												new ParametricExpression( ) {
												
													public SignalExpression eval( Map<String, Double> parameters ) {
														
														return new SignalExpression() {						
																	
															public double eval(double... variables) {
																return 1-(variables[getIndex(B_VAR_)]);
															}	
																				
														};	
																	
													}
												
												} , 
												true
											)		),
					new SurroundFormula(	
							new ParametricInterval( 
								new ParametricExpression() {
								
									public SignalExpression eval( final Map<String,Double> parameters ) {
							
										return new SignalExpression() {
											
											public double eval( double ... variables ) {
												return 0;
											}
											
										};					
										
									}
									
								} , 
								new ParametricExpression() {
								
									public SignalExpression eval( final Map<String,Double> parameters ) {
							
										return new SignalExpression() {
											
											public double eval( double ... variables ) {
												return parameters.get("dw");
											}
											
										};					
										
									}
									
								} 		
							)		
							, 
							
							new AtomicFormula( 
									new ParametricExpression( ) {
									
										public SignalExpression eval( Map<String, Double> parameters ) {
											
											return new SignalExpression() {						
														
												public double eval(double... variables) {
													return 1-(variables[getIndex(B_VAR_)]);
												}	
																	
											};	
														
										}
									
									} , 
									true
								)		
							, 			
							new EventuallyFormula(						new ParametricInterval( 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return 5;
									}
									
								};					
								
							}
							
						} , 
						new ParametricExpression() {
						
							public SignalExpression eval( final Map<String,Double> parameters ) {
					
								return new SignalExpression() {
									
									public double eval( double ... variables ) {
										return parameters.get("tw");
									}
									
								};					
								
							}
							
						} 		
					), new AtomicFormula( 
									new ParametricExpression( ) {
										
										public SignalExpression eval( Map<String, Double> parameters ) {
											
											return new SignalExpression() {						
														
												public double eval(double... variables) {
													return (variables[getIndex(B_VAR_)]);
												}	
																	
											};	
														
										}
									
									} , 
									true
								)	)
								)
					))
//				new SomewhereFormula( 
//					new ParametricInterval( 
//						new ParametricExpression() {
//						
//							public SignalExpression eval( final Map<String,Double> parameters ) {
//					
//								return new SignalExpression() {
//									
//									public double eval( double ... variables ) {
//										return 0;
//									}
//									
//								};					
//								
//							}
//							
//						} , 
//						new ParametricExpression() {
//						
//							public SignalExpression eval( final Map<String,Double> parameters ) {
//					
//								return new SignalExpression() {
//									
//									public double eval( double ... variables ) {
//										return parameters.get("d");
//									}
//									
//								};					
//								
//							}
//							
//						} 		
//					)		
//					 ,
//					new ReferencedFormula( 
//						this ,
//						"phiB"
//					)		
//				)		
				 ,
				null );				
		addParameter( "t" , 
			(double) 0 , 
			(double) 11 );
		addParameter( "d" , 
			(double) 0 , 
			(double) 1.5 );
		addParameter( "dw" , 
				(double) 0 , 
				(double) 3 );
		addParameter( "tw" , 
				(double) 0 , 
				(double) 20 );
	}
	
}
*/
