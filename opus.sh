#!/bin/bash

# Exit immediately if a command exits with a non-zero status.
set -e

# 1. Add all changes
echo "Staging all changes..."
git add .

# 2. Commit with a timestamp
# Create a timestamp (e.g., "2025-11-05 12:30:01")
timestamp=$(date +"%Y-%m-%d %H:%M:%S")

echo "Committing with timestamp: '$timestamp'..."
git commit -m "$timestamp"

# 3. Push to the main branch
echo "Pushing to origin main..."
git push -u origin main

echo "✅ Code pushed successfully!"
 