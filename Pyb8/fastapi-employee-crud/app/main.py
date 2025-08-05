from fastapi import FastAPI
from app.routers import employee
from app.database import engine, Base

app = FastAPI()

# Create the database tables
@app.on_event("startup")
def startup():
    Base.metadata.create_all(bind=engine)

app.include_router(employee.router)