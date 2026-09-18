#!/bin/bash
set -e

echo "[ValidateService] Starting validation..."

LOG_FILE="/tmp/java-all-ways-to-iterate.log"

# give the app a moment to flush and write the log
sleep 2

if grep -q "APPLICATION_COMPLETE_SUCCESS" "$LOG_FILE"; then
  echo "[ValidateService] SUCCESS: application completed successfully"
else
  echo "[ValidateService] FAILED: success marker not found in log"
  echo "[ValidateService] Dumping log output..."
  cat "$LOG_FILE"
  exit 1
fi

echo "[ValidateService] Validation complete"
