# backend-coding-challenge

I devolped a REST microservice based on spring boot that list the languages used by the 100 trending public repos on GitHub.
    For every language, I calculate the attributes below :
        -Number of repos using this language
        -The list of repos using the language

the microservice call the following endpoint in GitHub API v3 from the application.properties file : 

https://api.github.com/search/repositories?q=created:>{date}&sort=stars&order=desc&per_page=100

to fetch the last 100 rep created from the current date : you should just change {date} with the current date, the date format should respect the ISO 8601 format: YYYY-MM-DDTHH:MM:SSZ. 

Example :
https://api.github.com/search/repositories?q=created:>2020-03-03&sort=stars&order=desc&per_page=100

I created 3 REST endpoints :

1-list the languages used by the 100 trending public repos :

http://localhost:8080/api/trendRep

2-Number of repos using a language, by passing the languge to the requst parametre "lg":  

Example: nunmber of repos using Java language :
http://localhost:8080/api/trendRep/nbr/searchByLang?lg=Java

3-The list of repos using a language, by passing the languge to the requst parametre "lg":

Example: list of repos using Java language :
http://localhost:8080/api/trendRep/fetch/searchByLang?lg=Java



