# Comb

## User guide

1. Clone or download the project.
2. Import the projects into your Eclipse IDE.
3. Start a new run-time Eclipse with the aforementioned projects.
4. Import the [comb.expression.design](https://github.com/sarvaryk/Comb/tree/master/comb.expression.design) and the [comb.examples](https://github.com/sarvaryk/Comb/tree/master/comb.examples) projects into your run-time Eclipse.
5. In the `Model Explorer` view extend the `Comb` element within the `My.comb` file of the `comb.expression` project. Here you can see the root elements of the contained expressions and a graphical Sirius editor `new CombDiagramDescription`. To open it, double click it.
6. Here you can edit and save your requirements. You can observe various properties of the selected element in the `Properties` view.
7. To write an expression to a file, right click on an element under the main `Comb` element in the `Model Explorer` view and select "Comb generator/Generate".
8. The file is generated in the `comb.expression` project under the `expression-gen` folder.
