# Project Idea

A route planner app pedestrians which allows you to draw routes, mark them as completed, and has leaderboards/user interactions


# User Stories

Users: Walkers people who hike who want to connect, record, plan routes(?)

- As a walker, I want to be able to plan my hiking routes and see time estimates. (extra: pathfind/auto planning)
- As a walker, I want to see what trails are popular near me 
- As a walker, meet up some other walkers in the community 
- As a walker, I want to record how long it takes me to do hikes (enter manually because no mobile, may want to turn into a timer-based)
- As a walker, I want to be able to view my past routes and how long they took. 
- As a walker, I want to see how long it takes my friends to do hikes.


# Dedicated Parts

## Map Editor and Route Planning
Atilla implements

Graph-based storage of created routes. 

### Frameworks & APIs
- Openstreetmap API, integrated into SWIFT
- Database access
- Store screenshot of route when created

### Use Cases

- Users are able to draw & store maps, auto draw also possible
- Openstreetmap integrate properly into SWIFT.

## Routes Processing & Reccomendations
Daniel implements

Graph-based processing and querrying MongoDB.

### Frameworks & APIs
- Database Access, no extra processing done.

### Use Cases

- Have an algorithmic way of determining similar routes from the database using relational aspecs of the database, adds them to reccomended maps of the user in the database to be shown.
- Popular routes in the users' area
- People with same/similar routes, similar walking habits, player matching essentially. 


## Player interactions, sign-ups and leaderboards
James implements

Database interactions are rather non-relational in these areas. 

### Frameworks & APIs
- MongoDB

### Use Cases

- Home screen 
    - Main User stats
- Users screen
    - Displaying similar users
- Routes
    - Displaying past routes with times (w. screenshot) # May move to the reccomendation tasks due to UI compartmentalization
    - Displaying reccomended routes (w. screenshot)
    - Displaying routes planned (w. screenshot)
    - Marking as completed w. entered time
- Adding friends
- Leaderboard
    - Streak 
    - Miles walked in a week 
    - Time spent walking
    - Number of walks


# How the UI is designed, and the between-parts interactions

## UI

- Home (goes to the three mentioned, some stats)
    - Branches out to the three other UI's
- Player 
    - past routes, anything other than reccomendations essentially
    - Friends, add users
- Reccomendations 
    - Everything regarding the reccomendation task, players routes, popular routes. Also, similar players (add users functionality also here). 
- Route Planning Screen
    - The main map & route drawing logic. 

## interactions
We want to limit the interactions between the individual parts in the database, using a relational one allows us to do that. So the reccomendations can be generated automatically, and the users/reccomendation screen can pull from that when needed. 

Similarly, routes are uploaded with a graph-like structure, for them to be easier to process form the drawing sub-part. 



