# syntax=docker/dockerfile:1
FROM python:3.10.1
WORKDIR /EVOBATTLE
COPY requirements.txt requirements.txt
RUN pip install -r requirements.txt
EXPOSE 5000
CMD ["python", "consolehost.py"] 
