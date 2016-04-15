from flask import Flask
app = Flask(__name__)

@app.route("/generate/api")
def generate_api():
	return "Generated"

if __name__ == "__main__":
	app.run()