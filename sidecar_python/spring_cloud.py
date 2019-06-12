import json
import requests
from flask import Flask, Response

app = Flask(__name__)
@app.route("/health")
def health():
    result = {'status': 'UP'}
    return Response(json.dumps(result), mimetype='application/json')
@app.route("/getUser/<id>")
def getUser(id):
    result = {'id ': id, 'username': 'python', 'password': 'python'}
    return Response(json.dumps(result), mimetype='application/json')

app.run(port=3000, host='0.0.0.0')