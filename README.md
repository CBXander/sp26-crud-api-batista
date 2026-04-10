# League of Legends Champion API

A Spring Boot web application that displays my personal favorite League of Legends characters and their details.

## Technologies Used

- Java 25
- Spring Boot 4.0.3
- Spring MVC
- Spring Data JPA
- PostgreSQL (Neon)
- FreeMarker Templates
- HTML / CSS

## How to Run

1. Clone the repository
2. Open the project in your IDE
3. Configure your database connection in `src/main/resources/application.properties`
4. Run `LolapiApplication.java`
5. Open your browser and go to `http://localhost:8080/characters`

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET | /characters | Get all characters |
| GET | /characters/{id} | Get character by ID |
| GET | /characters/role/{role} | Get characters by role |
| GET | /characters/region/{region} | Get characters by region |
| GET | /characters/search?name= | Search characters by name |
| GET | /characters/new | Show add character form |
| POST | /characters | Add a new character |
| GET | /characters/{id}/edit | Show edit character form |
| POST | /characters/{id}/update | Update a character |
| POST | /characters/{id}/delete | Delete a character |

## Pages

- `/characters` — List of all champions
- `/characters/{id}` — Champion detail page
- `/characters/new` — Add a new champion
- `/characters/{id}/edit` — Edit an existing champion
- `/about` — About page

## Database

This app uses a PostgreSQL database hosted on Neon.

## Video link
