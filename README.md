# Movie recommendation project


### Objective
Using fundamental data structures and algorithms to solve real-world problems with arrays.


### Problem:   
Ahmed is sitting on the living room infront of the tv, and can't decide which movie should he watch. Build a movie recommendation system to help Ahmed in **deciding** which movie should he watch.

- You will be given a list of movies stored in an array.    
- A movie will have the following properities:   
`Id`, `name`, `type`, `rate`, `year`, `kind` (animation, real).

### Implementation
   
- Build a decision tree with a questions that helps to decide which type of movies the user would like.
- The decision tree should store`Yes` or `No` questions.
- Read the movies from the array.
- Based on the user answers the system should recommend a movie for the user that meets the user perfrences.

Run time example:

Figure 1    
<img width="350" alt="Example" src="https://github.com/SAFCSP-Team/movie-recommendation-project/blob/main/images/movie%20recomendation%20system.jpg">

   
Based on the user's answers, the recomended movie should have the below properties:

- Type: Action movie.
- Kind: real movie.
- Year: before 2000.
- When searching for the movie with the above properities, we will pick the most rated movie.






