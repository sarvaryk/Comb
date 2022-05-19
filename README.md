# Comb

## User guide

0. Install [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/release/2021-09/r/eclipse-ide-java-and-dsl-developers), and install the `Sirius 6.5` plug-in from the Eclipse Marketplace.
1. Clone or download the project.
2. Import the projects into your Eclipse IDE.
3. Start a new run-time Eclipse with the aforementioned projects: right click on a plug-in project (e.g. [comb.expression.design](https://github.com/sarvaryk/Comb/tree/master/comb.expression.design)) -> Run As -> Eclipse Application.
4. Import the [comb.expression.design](https://github.com/sarvaryk/Comb/tree/master/comb.expression.design) and the [comb.examples](https://github.com/sarvaryk/Comb/tree/master/comb.examples) projects into your run-time Eclipse.
5. Open the `Modeling Perspective`: Eclipse -> Window -> Perspective -> Open Perspective -> Other -> Modeling
6. In the `Model Explorer` view extend the `Comb` element within the [My.comb](https://github.com/sarvaryk/Comb/blob/master/comb.examples/My.comb) file of the [comb.examples](https://github.com/sarvaryk/Comb/tree/master/comb.examples) project. Here you can see the root elements of the contained expressions and a graphical Sirius editor `new CombDiagramDescription`. To open it, double click it.
7. Here you can edit and save your requirements. You can observe various properties of the selected element in the `Properties` view.
8. The various functions of a comb requirement can be accessed by right clicking on an element under the main `Comb` element in the `Model Explorer` view and select "Comb generator".
9. Graphical trace representations are generated in dot format into the [comb.examples](https://github.com/sarvaryk/Comb/tree/master/comb.examples) project. These can be used by Graphviz (see "Further dependencies" section).

## Further dependencies

The generated .dot format files can be viewed online, using [Graphviz online](https://dreampuf.github.io/GraphvizOnline)

For in-Eclipse graphical trace representation, the following dependencies are needed:
1. [Graphviz](https://graphviz.org/) needs to be installed, where the `dot` executable path  
   a. needs to be in the environment paths, or   
   b. it can be specified manually in the Eclipse -> Window -> Preferences -> Graphviz menu.  
2. The `TextUML Toolkit 2.13.0` Eclipse plug-in needs to be installed (may not work on operating systems other than Windows). Its view can be accessed trough the `Image Viewer` view (Eclipse -> Window -> Perspective -> Open Perspective -> Other -> Image Viewer)

## The contents of the Comb project

- [comb.examples](https://github.com/sarvaryk/Comb/tree/master/comb.examples): contains the example files of the Comb project
- [comb.expression.design](https://github.com/sarvaryk/Comb/tree/master/comb.expression.design): contains the graphical and textual representation of the operators. Also includes the configuration file (placed here, so its easier to access from the run-time eclipse)
- [comb.expression.metamodel](https://github.com/sarvaryk/Comb/tree/master/comb.expression.metamodel): contains the metamodel and the generated code which describe the supported operators
- [comb.expression.metamodel.edit](https://github.com/sarvaryk/Comb/tree/master/comb.expression.metamodel.edit) and [comb.expression.metamodel.editor](https://github.com/sarvaryk/Comb/tree/master/comb.expression.metamodel.editor): projects generated from the comb.expression.metamodel project, will be used as Eclipse plugins which contain the implementation of the model editor
- [comb.external.LTL2Buchi](https://github.com/sarvaryk/Comb/tree/master/comb.external.LTL2Buchi): contains the external LTL2Bchi project used for generating Büchi-automatons from LTL requirements
- [comb.external.BatMonGen](https://github.com/sarvaryk/Comb/tree/master/comb.external.BatMonGen): contains the external BatMon Gen project used for generating monitor components from Büchi-automatons
- [comb.external.jSSTL](https://github.com/sarvaryk/Comb/tree/master/comb.external.jSSTL): contains the external jSSTL project used for generating monitor components from MTL, MITL, STL and SSTL based requirements
- [comb.generator.action](https://github.com/sarvaryk/Comb/tree/master/comb.generator.action): contains the files which are implementing the functions of the context menu (like import, export, saving different automaton formats and interpretations, initiating monitor synthesis)

## Special thanks

Special thanks for the other tools which are integrated into the Comb project:
[jSSTL](https://github.com/Quanticol/jsstl), [LTL2Buchi](https://github.com/fraimondi/ltl2buchi), [ROBDD](https://github.com/tejasnikumbh/ROBDD)
