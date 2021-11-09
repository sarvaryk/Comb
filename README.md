# Comb

## User guide

0. Install [Eclipse IDE for Java and DSL Developers](https://www.eclipse.org/downloads/packages/release/2021-09/r/eclipse-ide-java-and-dsl-developers), and install the `Sirius 6.5` plug-in from the Eclipse Marketplace.
1. Clone or download the project.
2. Import the projects into your Eclipse IDE.
3. Start a new run-time Eclipse with the aforementioned projects: right click on a plug-in project (e.g. [comb.expression.design](https://github.com/sarvaryk/Comb/tree/master/comb.expression.design)) -> Run As -> Eclipse Application.
4. Import the [comb.expression.design](https://github.com/sarvaryk/Comb/tree/master/comb.expression.design) and the [comb.examples](https://github.com/sarvaryk/Comb/tree/master/comb.examples) projects into your run-time Eclipse.
5. Eclipse may not allow to build the project as [comb.expression.design](https://github.com/sarvaryk/Comb/tree/master/comb.expression.design) and [comb.expression.action](https://github.com/sarvaryk/Comb/tree/master/comb.expression.action) are referencing each other. Setting circular dependncy from error to warning (allowing to build the project) can be done as follows: Eclipse -> Window -> Preferences -> Java -> Compiler -> Building -> Circular Dependencies -> Error to Warning
6. Open the `Modeling Perspective`: Eclipse -> Window -> Perspective -> Open Perspective -> Other -> Modeling
7. In the `Model Explorer` view extend the `Comb` element within the `My.comb` file of the `comb.expression` project. Here you can see the root elements of the contained expressions and a graphical Sirius editor `new CombDiagramDescription`. To open it, double click it.
8. Here you can edit and save your requirements. You can observe various properties of the selected element in the `Properties` view.
9. The various functions of a comb requirement can be accessed by right clicking on an element under the main `Comb` element in the `Model Explorer` view and select "Comb generator".
10. Graphical trace representations are generetaed in dot format into the [comb.examples](https://github.com/sarvaryk/Comb/tree/master/comb.examples) project. These can be used by Graphviz (see "Further dependencies" section).

## Further dependencies

The generated .dot format files can be viewed online, using [Graphviz online](https://dreampuf.github.io/GraphvizOnline)

For in-Eclipse graphical trace representation, the following dependencies are needed:
1. [Graphviz](https://graphviz.org/) needs to be installed, where the `dot` executable path needs to be in the environment paths.
2. The `TextUML Toolkit 2.13.0` Eclipse plug-in needs to be installed (may not work on operating systems other than Windows). Its view can be accessed trough the `Image Viewer` view (Eclipse -> Window -> Perspective -> Open Perspective -> Other -> Image Viewer)

