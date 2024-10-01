# HP Quiz Project - Rest Api

This project is part of a full stack application that creates a Harry Potter-themed quiz. The quiz focuses on famous dialogues from the movies. The objective is to guess which character said a given line.

## Description

The backend is built with Spring Boot and is responsible for generating random quiz questions based on a database of movie dialogues. The main challenge is to guess which character from the Harry Potter films said the provided line. 

The backend retrieves a random dialogue from the database and provides all relevant information, such as:
- The correct character (answer)
- The location where the line was said
- The movie in which the dialogue appears
- The character's house (e.g., Gryffindor, Slytherin, etc.)

The data is served in JSON format at the following endpoints:
- `/quiz/dialogue` - Provides a random dialogue with all the related details.
- `/random/hpCharacters` - Exposes a random list of character names, excluding the correct answer, which is used for the quiz's multiple-choice options.

The database was populated using a Spring Batch project with CSV data sourced from an [external website](https://mavenanalytics.io/data-playground).

## Usage

Here are the main resources exposed by the backend:

- **GET `/quiz/dialogue`**  
  Returns a random dialogue from the Harry Potter films, with details such as the correct character, location, movie, and character house.
  
  Example response:
  ```json
  {
    "dialogueId": 3135,
    "chapter": {
      "chapterId": 117,
      "chapterName": "Best Foot Forward",
      "movie": {
        "movieId": 4,
        "movieTitle": "Harry Potter and the Goblet of Fire",
        "year": 2005,
        "runtime": 157,
        "budget": "$150,000,000",
        "boxOffice": "$896,400,000"
      },
      "movieChapter": 15
    },
    "place": {
      "placeId": 61,
      "placeName": "Transfiguration Classroom",
      "placeCategory": "Hogwarts"
    },
    "character": {
      "characterId": 14,
      "characterName": "Fred Weasley",
      "species": "Human",
      "gender": "MALE",
      "house": "GRYFFINDOR",
      "patronus": "",
      "wandWood": "",
      "wandCore": ""
    },
    "dialogue": "Try saying that five times faster."
  }
  ```

- **GET `/random/hpCharacters`**  
  Returns a random list of Harry Potter characters, excluding the correct character for the quiz. This can be used to generate the wrong answers for a multiple-choice quiz.
  
  Example response:
  ```json
  [
    "Ron Weasley",
    "Draco Malfoy",
    "Luna Lovegood",
    "Severus Snape"
  ]
  ```
