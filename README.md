# GeneticAlgorithm

Master's OOP Project

Abstract Factory pattern, strategy pattern and singleton patterns are applied to the algorithm



The project is created using Eclipse IDE.


__________Project description______________

This project uses Genetic Algorithm to solve a simultaneous set of two linear equations, 
there are 2 sets of linear equations been setted up as examples. SetOne has 4 variables, SetTwo has 3;

The GA seach range for the solutions are set to be <=10, this is used to reduce the round number of GA.
Because the search range is 10, so the solution values of simultaneous set must be <= 10 for this project.


_________Compile and Run___________________

	To run the code, import the project into Eclipse or other IDE and use Runner class(Runner.java) in Package Client
	to compile and run the code. 

	In order to run a GA, a creator object should be created, and use create object to use createGA("") method to
	create GA with certain factory. e.g CreateGA("One") create GA using GA Factroy One

	Then, we need to create SimultaneousSet object that we want to use, SetOne or SetTwo from the project.
	and create population object with type upper bounded by SimultaneousSet. e.g SetOne, SetTwo or SimultaneousSet
	assign the Equation set to population:
		/*
			population <SetOne>p=new population<>(5,e); //population takes in int to indicate how many 
								//chromosomes we want to give to the population.
		*/
	Finally, use GA object to run the population with certain Equation
		/*
			g1.run(p);

		*/
________________________The outputs from project_____________________

/*
SetOne
Round: 600 Solution: [5, 9, 2, 8]fitness: 0 Answer: 219 412 Equation: EquationOne

SetTwo
Round: 1547 Solution: [9, 9, 9]fitness: 0 Answer: 585 459 Equation: EquationTwo
*/

Above outputs shows that GA uses 600 rounds to find the solution of simultaneos SetOne, 
where the solution is [5, 9, 2, 8] or [x,y,z,w] (4 variables). fitness 0 means this solution 
is correct for simultaneous SetOne(fitness 0 is fittest in this project).
And it takes 1547 rounds to find the solution of SetTwo.



_______________________Singleton pattern_______________________________

Singleton pattern is applied to fitness class(fitness.java) in GAComponents package, where fitness class
is responsible for fitness calculation. 

The reason why this class is made as Singleton is because that we need to get the fitness of each chromosome each round,
so the fitness class will be used many times. 

And we don't want to create new instance of fitness class every time we use it. So making it Singleton will prevent this from 
happenning.


_______________________Strategy pattern_______________________________

Strategy pattern is used in GA.java in package GAFactory, GA.java contains an abstract class GA. 

We need to allow different GA Selection, Crossover and Mutation implementations
to be dynamically changed at runtime. So making these implementations as Strategy Objects in GA class 
will allow them to change dynamically at runtime.  

GA is context in this case. 

The creation of Strategy objects will be handled by Factory pattern.



_______________________Factory pattern_______________________________

Abstract factory pattern is used in this project, it is used to handle instantiation of GA 
Strategy objects, Selection, CrossOver and Mutation. In this way, Factory pattern is used together with Strategy pattern.

Because there are different Selection, CrossOver and Mutation, so different types of GA are possible.
We made 2 types of GA, GAOne and GATwo to indicate different GA type.
These classes take in a specified factory, and have a method combine() to use factory object to create Strategy Objects.

There are two concrete factory classes, GAOneFactory and GATwoFactory, these classes implements GAFactory interface.
They are responsible for the creation of different GA Strategy Objects.  

A Creator class is created to handle the creation of differnt GA. it takes a specified String Object and 
create corresponding factory object and GA object, and assign the factory object to GA Object. Then it uses 
GA method combine() to create Strategy object of the GA object.









