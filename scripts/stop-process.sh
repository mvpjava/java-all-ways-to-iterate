#!/bin/bash
set -e

echo "[ApplicationStop] Starting stop hook"

# find the PID of the running jar using wildcard on version number
PID=$(pgrep -f "java-all-ways-to-iterate-.*\.jar" || true)

if [ -n "$PID" ]; then
  echo "[ApplicationStop] Found running process with PID $PID, stopping..."
  kill $PID
  echo "[ApplicationStop] Process $PID stopped successfully"
else
  echo "[ApplicationStop] No running process found, nothing to stop"
fi

echo "[ApplicationStop] Stop hook complete"