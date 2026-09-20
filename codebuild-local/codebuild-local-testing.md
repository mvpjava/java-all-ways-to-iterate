1. Goto public aws ECR repo and find your CodeBuild image
   - https://gallery.ecr.aws/codebuild
   - Example: https://gallery.ecr.aws/codebuild/amazonlinux-x86_64-standard
2. On CLI
	- docker pull public.ecr.aws/codebuild/amazonlinux-x86_64-standard:corretto11
3 — Download the helper script (one-time)
	- curl -O https://raw.githubusercontent.com/aws/aws-codebuild-docker-images/master/local_builds/codebuild_build.sh
	- chmod +x codebuild_build.sh
4. Run your build locally on dev machine
	-  cd java-all-ways-to-iterate/
	- ../codebuild_build.sh -i public.ecr.aws/codebuild/amazonlinux-x86_64-standard:corretto11 -a /tmp/my-bodebuild-artifacts
		- (-a): is the output artifact directory
	- cd /tmp/my-bodebuild-artifacts
	- sudo unzip artifacts.zip

## Helper script:

    Starts the CodeBuild agent container
    Mounts your current directory as the source
    Spins up the build image container
    Reads your buildspec.yml
    and executes each phase
    Drops artifacts into /tmp/my-app-artifacts


## Useful Script Flags
	Flag	What it does	Example
	-i
		Build image to use	-i public.ecr.aws/codebuild/amazonlinux2-x86_64-standard:5.0
	-a
		Where to put artifacts	-a /tmp/artifacts
	-s
		Source directory (default: current dir)	-s /path/to/my-app
	-e
		File with env vars (KEY=VALUE
	per line)	-e ./env.txt
	-c
		Pass your local AWS credentials into the build	-c
	-b
		Use a different buildspec file	-b buildspec-test.yml
		

### Example: If your build needs AWS credentials (e.g. to pull from ECR, read S3)

./codebuild_build.sh \
  -i public.ecr.aws/codebuild/amazonlinux2-x86_64-standard:5.0 \
  -a /tmp/artifacts \
  -c   # ← injects your local ~/.aws credentials into the container

