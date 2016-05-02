# UBER SENTIMENT ANALYSIS

##Overview
This project mainly works on the sentiment analysis for UBER, This UBER is a transport service provider available almost in ten countries around the globe. This usually comes with an application available on all the smart phones on all the operating systems. This also works on the TFIDF scores i.e.,  term frequency–inverse document frequency. Now my project will classify the positive and negative feelings of customers using their reviews either posted on FACEBOOK or TWITTER. This mainly takes some reviews and trains the data according to the positive and negative analysis, after that automatically it will apply the reviews on test data and classifies the positive and negative reviews from the customers.

## Sentiment analysis
  Sentiment analysis in other words defined as opinion mining. In essence, it is the process of determining the emotional tone behind a series of words, used to gain an understanding of the attitudes, opinions and emotions expressed within an online mention. This sentimental analysis is usually used by the bussiness people or any web service providers to know the customers or people opinion on their work, a feedback from customers. This analysis will give us the positive or negative reviews on the customer opinions. For example we can consider Obama administration used the sentimental analysis to review the people opinion on the coming elections.
  
## DATASET
UBER sentiment analysis requires some data or reviews for the customers which contains both positive and negative reviews. For the data we will develop the FACEBOOK API or TWITTER API where we can pull the reviews of UBER based on the customer feelings about a post. But development of this API is very difficult as they were restricted from pulling the comments of the UBER from FACEBOOK. So we used OUTWIT to pull the comments. Outwit is a software available on web for we scraping. This uses some multiple hash tag commands in order to pull the data. Our team mata ajay is more concentrated on pulling the comments. Using the OUTWIT we got around 100+ reviews, we filtered junk from those reviews and finally we got twenty useful reviews which shows exact feelings from customers on UBER.
Some example reviews that we scraped using OUTWIT are:

- Gud app Recent update made this app bad..always no cars available n surging in uberx option.. POSITIVE
- Very poor service-  I have coupons but after completing my ride Uber has charged cash, executives told that my coupon deemed invalid. Poor service, bad drivers. Total disgusting.  NEGATIVE
- Good service. Good app-I like the app and love the service. The app should really add a tipping function though POSITIVE
- Love Uber-  Love uber every driver I've rode with is so professional and fun to chat with, I never have a problem  keep up the good work!  POSITIVE

##Research Questions:
Uber sentiment analysis mainly works on predicting the reviews of customers based on their feelings.
The research questions are as follows:
-	How to predict the feelings or experiences of customers using training data and clustering?
-	How to avoid the words that is most used, that is stop words?
-	What are the overall features of the customers on UBER service?
-	How this prediction process runs on different keywords?
-	How this training works based on the data we give as input?
-	What will be the different predictions of positive and negative keywords based on the code?

##MODELS AND ANALYSIS
In this development process we tried to use algorithems and a way different analysis of our Uber data but we got 50% of the prediction with those algorithems. In order to achive a success rate of the prediction we used some java code with TFIDF calculations and found 90% of the prediction values. In this we used some specific keywords to give a TFIDF frequency values based on that it will predict the reviews to be Positive or Negative.

##Code and application
We use java as our main source to develop the clustering code for Uber analysis. We started researching about the algorithems which involve in clustring process. But as a defult algorithem we use KMEANS algorithem in order to perform this analysis.


## Project Management
Our project consists of two people Ajay Gaddam(0513), Kiran Kumar(0458). In this Ajay Gaddam as we were restricted in pulling comments using facebook API we planned to use OUTWIT which is web available software to scrape the comments on UBER from FACEBOOK and TWITTER. Kiran kumar will be working on testing the pulled comments and final resting and reporting of the entire documentation.

| TEAM MEMBER | ROLES AND SKILLS | CONTRIBUTION | 
|-------------|------------------|-------------------------------------------|
| ABHINAND SHARMA(0592) | Coding for sentiment classification | Development of entire sentimental analysis code |
|Ajay Gaddam(0513) | Usage of OUTWIT | Outwit usage in order to scrape the reviews|
|Kiran kumar Adepu(0458) | Testing and Reporting | Data tesing; Final testing; Reviewing and Reporting |

##PROJECT DELIVERABLES AND CHECKPOINTS

| Checkpoint date | Expected Deliverable                                                          | Responsible team member(s) | Checkpoint results                                                                                                                  |
|-----------------|-------------------------------------------------------------------------------|----------------------------|-------------------------------------------------------------------------------------------------------------------------------------|
|03/02/2016| OUTWIT data scraped on UBER from facebook and twitter|Abhinand, Ajay, kiran|We used a web scraper called OUTWIT inorder to scrape the UBER reviews from twitter. All our team members did a research on Webscraper, and twitter reviews |
|03/22/2016| Classifying datasets| Abhinand, Kiran| Classifying the keywords which represent positive and negative expression in the reviews, We pulled 100+ reviews in which more junk reviews were removed. Abhinand worked on filtering the useful comments, Kiran worked on classifing the positive and negative comments|
|04/10/2016| Development of classifiers code| Abhinand, Kiran, Ajay| We tried to develop the required code using JAVA, but we faced prblems in developing the algorithems, but even though we are in a process of developing a code based on NLTP frequency ranges of each words which will give the positive or negative results based on the frequency values. We three are working on this in order to develop as soon as possible.|
|04/25/2016|Reporting| Abhinand, Kiran| Final testing and reporting of final data and results|








