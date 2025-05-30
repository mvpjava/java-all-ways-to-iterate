#!/bin/bash

echo "Killing app.py if already running from previous deployment"

pkill -f "python3 app.py" || echo "App not running"
