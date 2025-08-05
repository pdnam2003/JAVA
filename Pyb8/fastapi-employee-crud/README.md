# FastAPI Employee CRUD Application

This project is a simple CRUD application built with FastAPI for managing Employee records. It utilizes MySQL for data storage and SQLAlchemy for ORM.

## Project Structure

```
fastapi-employee-crud
├── app
│   ├── main.py            # Entry point of the application
│   ├── models.py          # SQLAlchemy models for the Employee object
│   ├── schemas.py         # Pydantic schemas for data validation
│   ├── crud.py            # CRUD operations for Employee records
│   ├── database.py        # Database connection setup
│   └── routers
│       └── employee.py    # API routes for Employee operations
├── requirements.txt       # Project dependencies
├── alembic.ini            # Alembic configuration for migrations
└── README.md              # Project documentation
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd fastapi-employee-crud
   ```

2. **Create a virtual environment:**
   ```
   python -m venv venv
   source venv/bin/activate  # On Windows use `venv\Scripts\activate`
   ```

3. **Install dependencies:**
   ```
   pip install -r requirements.txt
   ```

4. **Set up the database:**
   - Ensure you have MySQL installed and running.
   - Create a database for the application.
   - Update the database connection settings in `app/database.py`.

5. **Run the application:**
   ```
   uvicorn app.main:app --reload
   ```

## Usage

- The API provides endpoints for creating, reading, updating, and deleting Employee records.
- You can access the API documentation at `http://127.0.0.1:8000/docs` after running the application.

## License

This project is licensed under the MIT License.