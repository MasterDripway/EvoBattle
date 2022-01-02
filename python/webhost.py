from fastapi import FastAPI
from starlette.routing import Host
import uvicorn



"""
TODO:
- IMPLEMENT A WEB INTERFACE FOR THE GAME
WHICH INCLUDES 
  character chooser
  character creator
  character visualizer
  match recap
  match simulation (to check flukes)

"""

app = FastAPI()

@app.get("/")
def home():
    return "hello world"

if __name__ == "__main__":
    uvicorn.run(app)