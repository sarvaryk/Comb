# Comb

## User guide

1. Clone or download the project.
2. Import the projects into your Eclipse IDE.
3. Start a new run-time Eclipse with the aforementioned projects.
4. Import the [comb.expression.design](https://github.com/sarvaryk/Comb/tree/master/comb.expression.design) and the [comb.examples](https://github.com/sarvaryk/Comb/tree/master/comb.examples) projects into your run-time Eclipse.
5. Eclipse may not allow to build the project as [comb.expression.design](https://github.com/sarvaryk/Comb/tree/master/comb.expression.design) and [comb.expression.action](https://github.com/sarvaryk/Comb/tree/master/comb.expression.action) are referencing each other. Setting circular dependncy from error to warning (allowing to build the project) can be done as follows: Eclipse -> Window -> Preferences -> Java -> Compiler -> Building -> Circular Dependencies -> Error to Warning
6. In the `Model Explorer` view extend the `Comb` element within the `My.comb` file of the `comb.expression` project. Here you can see the root elements of the contained expressions and a graphical Sirius editor `new CombDiagramDescription`. To open it, double click it.
7. Here you can edit and save your requirements. You can observe various properties of the selected element in the `Properties` view.
8. The various functions of a comb requirement can be accessed by right clicking on an element under the main `Comb` element in the `Model Explorer` view and select "Comb generator".
