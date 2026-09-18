#!/bin/bash

set -e

echo "[ApplicationStart] Starting application..."

java -jar /tmp/java-all-ways-to-iterate-0.0.1-SNAPSHOT.jar > /tmp/java-all-ways-to-iterate.log 2>&1

echo "[ApplicationStart] Application finished"
