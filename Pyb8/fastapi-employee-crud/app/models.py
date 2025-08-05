from sqlalchemy import Column, Integer, String, Date
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()

class Employee(Base):
    __tablename__ = 'employees'

    id = Column(Integer, primary_key=True, index=True)
    firstname = Column(String(50), nullable=False)
    middlename = Column(String(50), nullable=True)
    lastname = Column(String(50), nullable=False)
    birthday = Column(Date, nullable=False)
    phone = Column(String(15), nullable=True)
    email = Column(String(100), nullable=False, unique=True)