from app import app

@app.route("/generate/api")
def generate_api():
	return "Generated"
