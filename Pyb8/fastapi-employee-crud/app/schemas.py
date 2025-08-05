from pydantic import BaseModel
from datetime import date

class EmployeeBase(BaseModel):
    firstname: str
    middlename: str = None
    lastname: str
    birthday: date
    phone: str
    email: str

class EmployeeCreate(EmployeeBase):
    pass

class EmployeeUpdate(EmployeeBase):
    pass

class Employee(EmployeeBase):
    id: int

    class Config:
        orm_mode = True