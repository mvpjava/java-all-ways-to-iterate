#!/bin/bash
set -e

echo "[AfterInstall] Starting after-install hook"

# fetch config from Parameter Store and print to log
echo "[AfterInstall] Fetching application.properties from AWS Parameter Store..."

aws ssm get-parameter \
  --name "/java-all-ways-to-iterate/dev/application.properties" \
  --query "Parameter.Value" \
  --output text \
  --region eu-west-2

echo "[AfterInstall] After-install hook complete"
