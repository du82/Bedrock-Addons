# Bedrock Addons
Official Bedrock Addons repository for the app on [Google Play](https://play.google.com/store/apps/details?id=com.mcres.octarus). We're on track to becoming the biggest Minecraft Android apps platform! With over 17 known clones up on Google Play mirroring the original API.

## What's the purpose?
The purpose of releasing the app as open-source is to provide a way for app developers to learn from my code and adapt it to their liking. 
This is also designed to be an open alternative to MCPEAddons and allow content creators complete freedom over their content.

## Is it limited to video games?
You don't have to just use it for Minecraft or video games, you can change anything you want, and no code is obfuscated so modify to your liking.
There are no limits on what you can do with this.

## How do I get started
[Clone the repository](https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/cloning-a-repository) and then [download Android Studio](https://developer.android.com/studio).
Once you have done that, select the file location of where you saved Bedrock Addons locally, and open it in Android Studio. Wait for it to load the project resources, and then [set up an AVD](https://developer.android.com/studio/run/managing-avds).
From there, click on "Build App" and it should install for the first time onto the device you set up. You are now ready to start experimenting with the code.

## Using the layouts
All layouts have been designed in a way that's easy to find what code came from what drawable or other resource file. You can use the "Find Usages" tool to find what else is using that resource and how it is being used throughout the project.

## What does what?
I have commented on some parts of the code, and in the Build Config file you can change multiple properties of the app eaily. I will continue to add comments where helpful to show what does what, why, and how.

## Releasing the server application
The server application will be released in a month or so, but I have kept it closed up until now to prevent competition.
Please know that the server application is not required to build and run this Android app, and it isn't required to use the layouts or any code in your own projects.

## Documentation
You can read up on Bedrock Addons at the [Documentation Website](https://octarus.dev/project/bedrock-addons/).
This project is on a hiatus while I work on projects that are more fun and less stressful. The Bedrock Addons servers will remain online.

## What type of data is collected and where?
See below tables for a break-down of the types of data collected and associated applications.

Scope of Data | Depends on   | Optional     | Visibility       | Details
:------------ |:------------ |:------------ |:---------------- |:------------ |
Email addresses | | Yes, if email provided | You + Admins | Used to create an Octarus account
User preferences | Device ID | Yes | You only | Managing things like favories, color scheme, and local account info
System information | Device ID | No, system information collection is mandatory | Admins | Operating system, application/SDK versions, and unique install identifier
Google Analytics | | Android only |  Admins | User behavior and interactions within the applications are tracked. This is not linked to an Octarus account.
Content access analytics | Device ID | No | Everyone | Content analytics data lets anyone view how content is ranking it and how many views and downloads it is getting.
IP addresses | | No, use VPN to protect | Everyone | Any access to Bedrock Addons is logged for spam prevention and moderation.

## Where is the account and analytics data stored?
Octarus encrypts and stores user data securely on our own servers. Analytics data is stored on our own servers, and data that is collected through the use of Google Analytics is anonymized and stored by Google.

## What information is shared with others in the network? {#p2p}
Anyone can download and set up this project, and start their own Android app. Developers utilizing the APIs do have acccess to a limited amount of user data along with analytics, and other required information to make the service function.
