[![Build Status](https://travis-ci.com/IBM/vpc-java-sdk.svg?branch=master)](https://travis-ci.com/IBM/vpc-java-sdk)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.ibm.cloud/vpc/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.ibm.cloud/vpc)
[![Javadoc](https://img.shields.io/static/v1?label=javadoc&message=latest&color=blue)](https://ibm.github.io/vpc-java-sdk/docs/latest)
[![Release](https://img.shields.io/github/v/release/IBM/vpc-java-sdk)](https://github.com/IBM/vpc-java-sdk/releases/latest)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release)

# IBM Cloud VPC Java SDK Version 0.10.0
Java client library to interact with various [IBM Cloud VPC offerings](https://cloud.ibm.com/apidocs/vpc?code=java?).

This SDK uses [Semantic Versioning](https://semver.org), and as such there may be backward-incompatible changes for any new `0.y.z` version.

## Table of Contents

<!--
  The TOC below is generated using the `markdown-toc` node package.

      https://github.com/jonschlinkert/markdown-toc

  You should regenerate the TOC after making changes to this file.

      npx markdown-toc --maxdepth 4 -i README.md
  -->

<!-- toc -->

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Using the SDK](#using-the-sdk)
- [Questions](#questions)
- [Issues](#issues)
- [Open source @ IBM](#open-source--ibm)
- [Contributing](#contributing)
- [License](#license)

<!-- tocstop -->

## Overview

The IBM Cloud VPC Java SDK allows developers to programmatically interact with the following IBM Cloud services:

Service Name | Artifact Coordinates
--- | ---
[VPC](https://cloud.ibm.com/apidocs/vpc?code=java) | com.ibm.cloud:vpc:0.10.0

## Prerequisites

[ibm-cloud-onboarding]: https://cloud.ibm.com/registration

* An [IBM Cloud][ibm-cloud-onboarding] account.
* An IAM API key to allow the SDK to access your account. Create an apikey [here](https://cloud.ibm.com/iam/apikeys).
* Java 8 or above.

## Installation
The current version of this SDK is: 0.10.0

Each service's artifact coordinates are listed in the **Overview** table.

The project artifacts are published on the following public maven repositories:
<!-- - [JCenter](https://bintray.com/bintray/jcenter) - For information on how to use the
public JCenter maven repository, open [this link](https://bintray.com/bintray/jcenter)
then click the `Set Me Up!` button. -->
- [Maven Central](https://repo1.maven.org/maven2/) - The default public repository
used by maven to search for dependencies. To use this repository within your
gradle build, see [Declaring repositories](https://docs.gradle.org/current/userguide/declaring_repositories.html).

To use a particular service, define a dependency that contains the
artifact coordinates (group id, artifact id, and version) for the service, like this:

##### Maven

```xml
<dependency>
    <groupId>com.ibm.cloud</groupId>
    <artifactId>vpc</artifactId>
    <version>0.10.0</version>
</dependency>
```

##### Gradle
```gradle
'com.ibm.cloud:vpc:0.10.0'
```

## Using the SDK
For general SDK usage information, see the [IBM Cloud SDK Common README](https://github.com/IBM/ibm-cloud-sdk-common/blob/master/README.md)

## Questions

If you have difficulties using this SDK or you have a question about the IBM Cloud services,
ask a question at [Stack Overflow](http://stackoverflow.com/questions/ask?tags=ibm-cloud).

## Issues
If you encounter an issue with the project, you are welcome to submit a
[bug report](https://github.com/IBM/vpc-java-sdk/issues).
Before you create a new issue, search for similar issues. It's possible that someone has already reported the problem.

## Open source @ IBM
Find more open source projects on the [IBM GitHub Page](http://ibm.github.io/)

## Contributing
See [CONTRIBUTING](https://github.com/IBM/vpc-java-sdk/blob/master/CONTRIBUTING.md).

## License

The IBM Cloud VPC Java SDK is released under the Apache 2.0 license.
The license's full text can be found in [LICENSE](https://github.com/IBM/vpc-java-sdk/blob/master/LICENSE).
