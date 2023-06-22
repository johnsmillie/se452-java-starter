<a name="br1"></a> 

Object Oriented Enterprise Computing



<a name="br2"></a> 

§ Session Objective

§ Administrative

§ 12 Factor Concept Overview

§ Environment Overview

§ Before next class

§ Session Objective Review



<a name="br3"></a> 

§ Apply object-oriented techniques in design, development, and integration

of server side enterprise application (LO1)



<a name="br4"></a> 



<a name="br5"></a> 

§ Ken or M r. Yu (not Dr. Yu)

§ I do NOT use emails for communication. Subscribe to the D2L news or login to

determine any course specific messages

§ Email: Please use D2L email, if no response within 24 hours, please separate email

to [kyu@cdm.depaul.edu](mailto:kyu1@mail.depaul.edu)

§ Begin subject with SE352/452 – (Your Name) Email topic

§ Please leverage D2L Weekly discussion thread about particular week topic

§ I subscribe to only weekly and environmental threads NOT group discussion threads



<a name="br6"></a> 

§ Apply object-oriented techniques in the design, development, and integration of server

side enterprise application using technologies such as servlets, Java Server Pages,

and JDBC.

§ Topics include web applications, multi-tier architecture, model-view-controller

architecture, database connectivity, and security

§ This is NOT programming class. It is Software Engineering with enterprise application

concepts and to see those concepts applied is using application development using

java programming language.



<a name="br7"></a> 

§ ALL course material is delivered through D2L

§ Lectures, Quizzes, Announcements, and sample project

§ ALL submission is expected through D2L

§ Quizzes, Project Submissions, Individual Submissions



<a name="br8"></a> 



<a name="br9"></a> 

[Syllabus](https://depauledu-my.sharepoint.com/:w:/g/personal/kyu1_depaul_edu/EV-1buBYdypErRhyZpt3cUsB2Y3cnj6fqDnlFVNVZ8Kkwg?e=203nw7)



<a name="br10"></a> 

[Project](https://depauledu-my.sharepoint.com/:w:/g/personal/kyu1_depaul_edu/Ef8kZOtRrdVJhAeGqdZ0dc4B_Y-OZp-0AskbCJASP2xg2A?e=YIJudo)[ ](https://depauledu-my.sharepoint.com/:w:/g/personal/kyu1_depaul_edu/Ef8kZOtRrdVJhAeGqdZ0dc4B_Y-OZp-0AskbCJASP2xg2A?e=YIJudo)[Review](https://depauledu-my.sharepoint.com/:w:/g/personal/kyu1_depaul_edu/Ef8kZOtRrdVJhAeGqdZ0dc4B_Y-OZp-0AskbCJASP2xg2A?e=YIJudo)



<a name="br11"></a> 

[DePaul-KenYu/SE452](https://github.com/DePaul-KenYu/SE452)[ ](https://github.com/DePaul-KenYu/SE452)[(github.com)](https://github.com/DePaul-KenYu/SE452)



<a name="br12"></a> 



<a name="br13"></a> 

§ Class vs Object vs Interface

§ Encapsulation, Inheritance

§ Checked vs Runtime Exception and Exception handling

§ Compile time vs Run time

§ Coding standards

§ <https://google.github.io/styleguide/javaguide.html>

§ Special attention to Section 5

§ Package-info.java

§ Package specific documentation. For project, this is where individual documentations will be

located



<a name="br14"></a> 

§ Communication

§ Meeting times

§ Communication mechanism

§ Common Definitions

§ What are you building?

§ Who is doing what?

§ Work break down

§ Technology

§ Source code repository

§ Code standards

§ Connectivity



<a name="br15"></a> 

<https://12factor.net/>



<a name="br16"></a> 

§ Development methodology drafted by group of people at Heroku to provide cloud first

application that is dynamic and scalable.

§ <https://www.heroku.com/>



<a name="br17"></a> 

**#**

**Concept**

**Description**

1

Codebase

One codebase tracked in revision control, many deploys

Explicitly declare and isolate dependencies

Store configuration in the environment

2

Dependencies

Configuration

Backing Services

Build, release, run

Processes

3

4

Track backing services as attached resource

Strictly separate build and run stages

5

6

Execute the app as one or more stateless processes

Export services via port binding

7

Port binding

Concurrency

Disposability

Dev/prod parity

Logs

8

Scale out via the process model

9

Maximize robustness with fast startup and graceful shutdown

Keep development, staging, and production as similar as possible

Treat logs as event streams

10

11

12

Admin processes

Run admin/management tasks as one-off processes



<a name="br18"></a> 

[~~12~~](https://12factor.net/dependencies)[~~ ](https://12factor.net/dependencies)[FACTOR~~](https://12factor.net/dependencies)[~~ ](https://12factor.net/dependencies)[-~~](https://12factor.net/dependencies)[~~ ](https://12factor.net/dependencies)[CODEBASE~~](https://12factor.net/codebase)

§ One codebase tracked in revision

control, many deploys



<a name="br19"></a> 

Github (https://github.com)

• Open source project leveraging git source control

• Barring anything else from your team member, use this

**Branch**

§ branch newBranchName

**Basic**

§ init

§ add

§ checkout branchName

§ merge branchName

§ commit

§ push

§ pull

§ branch –d branchToDelete

<https://www.youtube.com/watch?v=9pa_PV2LUlw>

<https://learngitbranching.js.org/>



<a name="br20"></a> 

Working or

Stage

push

pull

Local

Repository

Remote

Repository

commit

area

• init

• branch

• create

create

• merge

• delete

• checkout



<a name="br21"></a> 

Merge

Branch



<a name="br22"></a> 

§ Git

§ [Course](https://github.com/DePaul-KenYu/SE452)

§ Different release for the major topics (eg java-start branch)

§ README.md

§ Concept

§ Project

§ Package-info.java

§ Project



<a name="br23"></a> 

[An](https://www.redhat.com/architect/12-factor-app)[ ](https://www.redhat.com/architect/12-factor-app)[illustrated](https://www.redhat.com/architect/12-factor-app)[ ](https://www.redhat.com/architect/12-factor-app)[guide](https://www.redhat.com/architect/12-factor-app)[ ](https://www.redhat.com/architect/12-factor-app)[to](https://www.redhat.com/architect/12-factor-app)[ ](https://www.redhat.com/architect/12-factor-app)[12](https://www.redhat.com/architect/12-factor-app)[ ](https://www.redhat.com/architect/12-factor-app)[Factor](https://www.redhat.com/architect/12-factor-app)[ ](https://www.redhat.com/architect/12-factor-app)[Apps](https://www.redhat.com/architect/12-factor-app)[ ](https://www.redhat.com/architect/12-factor-app)[|](https://www.redhat.com/architect/12-factor-app)[ ](https://www.redhat.com/architect/12-factor-app)[Enable](https://www.redhat.com/architect/12-factor-app)[ ](https://www.redhat.com/architect/12-factor-app)[Architect](https://www.redhat.com/architect/12-factor-app)

[(redhat.com)](https://www.redhat.com/architect/12-factor-app)



<a name="br24"></a> 

[~~12~~](https://12factor.net/dependencies)[~~ ](https://12factor.net/dependencies)[FACTOR~~](https://12factor.net/dependencies)[~~ ](https://12factor.net/dependencies)[-~~](https://12factor.net/dependencies)[~~ ](https://12factor.net/dependencies)[DEPENDENCIES~~](https://12factor.net/dependencies)

§ Explicitly declare using dependency declaration manifest

§ Isolate dependencies to avoid system dependencies



<a name="br25"></a> 

§ IDE

§ VS Code

§ Extension: Lombok

§ Best of language

§ IntelliJ

§ Pycharm

§ [Spring](https://start.spring.io/)[ ](https://start.spring.io/)[Initializer](https://start.spring.io/)

§ Maven vs Gradle

§ Declaring Dependencies

§ DevTools

§ Lombok



<a name="br26"></a> 

§ Original Website - <https://12factor.net/>

§ Safari Book – [Beyond](https://learning.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)[ ](https://learning.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)[the](https://learning.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)[ ](https://learning.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)[Twelve](https://learning.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)[ ](https://learning.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)[Factor](https://learning.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)[ ](https://learning.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)[App](https://learning.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631)



<a name="br27"></a> 



<a name="br28"></a> 

§ Milestone 1 Review

§ Milestone 1 Recommendation

§ Have 2 meeting sessions

1\. Develop project topic

2\. IDE selection and Code Merge session

§ Codebase

§ Have 1 person create the base project and check into github

§ Practice Git creating branch for each team member and merging in 1 session together

§ Sample

§ View sample project



<a name="br29"></a> 

§ Prepare to turn in Milestone 1



<a name="br30"></a> 

§ Course intro

§ Administrative

§ Apply object-oriented techniques in design, development, and integration

of server side enterprise application (LO1)

§ Baseline and setup

§ Java

§ Spring

§ Junit

