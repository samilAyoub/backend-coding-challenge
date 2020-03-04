# backend-coding-challenge

I devolped a REST microservice based on spring boot that list the languages used by the 100 trending public repos on GitHub.
    For every language, you need to calculate the attributes below :
        -Number of repos using this language
        -The list of repos using the language

the application call the following endpoint in GitHub API v3 from the application.properties file: 

https://api.github.com/search/repositories?q=created:>2020-03-04&sort=stars&order=desc&per_page=100

to fetsh the last 100 rep created from the current date : you should just passe the current date in the HTTP request. 


i created 3 end points :

1-list the languages used by the 100 trending public repos :

http://localhost:8080/api/trendRep

2-Number of repos using a language, by passing a prametre "lg":  

Example: nunmber of repos using Java language :
http://localhost:8080/api/trendRep/nbr/searchByLang?lg=Java

3-The list of repos using a language, by passing a prametre "lg":

Example: list of repos using Java language :
http://localhost:8080/api/trendRep/fetch/searchByLang?lg=Java



