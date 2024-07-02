# Movie recommendation project


### Objective
Using fundamental data structures and algorithms, solve real-world problems with trees.


### Problem    
Ahmed is sitting in the living room in front of the TV, and can't decide which movie to watch. Build a movie recommendation system to help Ahmed **decide** which movie to watch.

- You will be given a list of movies stored in an array.    
- A movie will have the following properties:   
`Id`, `name`, `rate`, `year`, `genre` (animation, comedy, action).

### Implementation
   
- Build a decision tree with questions that help to decide which type of movies the user would like.
- The decision tree should store `Yes` or `No` **questions**.
- Read the movies from the array.
- Based on the user's answers the system should recommend a movie for the user that meets the user's preferences.

Run time example:

System: Do you like comedy movies?   
User: No.   
System: Do you like action movies?   
User: Yes.   
System: Do you like old movies? (before 2000)?   
User: Yes.   
System:    
We recommend the following movie for you:   
Movie name: The Matrix   
Year: 1999   
genre: Action   
Rate: 8.7   


   
Based on the user's answers, the recommended movie should have the following properties:

- Genre: action movie.
- Year: before 2000.
- When searching for the movie with the above properties, we will pick the most rated movie.

Decision:





