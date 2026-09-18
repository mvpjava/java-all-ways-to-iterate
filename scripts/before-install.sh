#!/bin/bash
set -e

echo "[BeforeInstall] Starting cleanup hook"

# remove any previously deployed jar from /tmp
if ls /tmp/java-all-ways-to-iterate-*.jar 1> /dev/null 2>&1; then
  echo "[BeforeInstall] Found old jar(s), removing..."
  rm -f /tmp/java-all-ways-to-iterate-*.jar
  echo "[BeforeInstall] Old jar(s) removed successfully"
else
  echo "[BeforeInstall] No old jar found, nothing to clean up"
fi

echo "[BeforeInstall] Cleanup hook complete"
