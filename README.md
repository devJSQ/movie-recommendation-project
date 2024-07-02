# Movie recommendation project


### Objective
Using fundamental data structures and algorithms, solve real-world problems with trees.


### Problem    
Ahmed is sitting in the living room in front of the TV, and can't decide which movie to watch. Build a movie recommendation system to help Ahmed **decide** which movie to watch.

- You will be given a list of movies stored in an array.    
- A movie will have the following properties:   
`Id`, `name`, `rate`, `year`, `genre` (animation, comedy, action, drama).

### Implementation
   
- Build a decision tree with questions that help to decide which type of movies the user would like.
- The decision tree should store `Yes` or `No` **questions**.
- Read the movies from the array.
- Based on the user's answers the system should recommend a movie for the user that meets the user's preferences.

- Add your code in `DecisionTree.java` and `Main.java` classes.

Run time example:

System: Do you like comedy movies?   
User: No.   
System: Do you like action movies?   
User: Yes.   
System: Do you like old movies (before 2000)?   
User: Yes.   

Based on the user's answers, the recommended movie should have the following properties:

- Genre: action movie.
- Year: before 2000.
- When searching for the movie with the above properties, The system should pick the most rated movie.   

System:    
We recommend the following movie for you:   
Movie name: The Matrix   
Year: 1999   
genre: Action   
Rate: 8.7   



### Qualification to pass
- [ ] The code should run successfully.
- [ ] Completely define the decision tree class.
- [ ] Completely define the Main class.
- [ ] Run and test all the below test cases:

- [ ] Test case 1:
   
System: Do you like comedy movies?   
User: No.   
System: Do you like action movies?   
User: Yes.   
System: Do you like old movies (before 2000)?   
User: Yes.   
   
System:       
We recommend the following movie for you:   
Movie name: The Matrix   
Year: 1999   
genre: Action   
Rate: 8.7   
   
- [ ] Test case 2:

System: Do you like comedy movies?   
User: No.   
System: Do you like action movies?   
User: No.   
System: Do you like animated movies?   
User: Yes.   
System: Do you like old movies (before 2000)?   
User: Yes.   
   
System:       
We recommend the following movie for you:   
Movie name: The Lion King   
Year: 1994      
genre: Animated   
Rate: 8.5  

- [ ] Test case 3:

System: Do you like comedy movies?   
User: No.   
System: Do you like action movies?   
User: No.   
System: Do you like animated movies?   
User: No.
System: Do you like drama movies?   
User: Yes.   
System: Do you like old movies (before 2000)?   
User: No.   
   
System:       
We recommend the following movie for you:   
Movie name: Oppenheimer   
Year: 2023      
genre: Drama   
Rate: 8.3  









