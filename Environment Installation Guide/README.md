# Environment Setup Guide
---

## Purpose

> This document provides a list of the required technologies for this program. It details why each technology is required and provides some step-by-step instructions on how to install and configure the technologies. This guide also walks you through any needed environment setup.

**NOTE**: It is VERY important that you install these technologies before training begins as we will not have much time to devote to environment setup due to the volume of content we'll cover. It is also important that you install the correct versions of the tools listed here as not all versions of the technologies we will use are guaranteed to be compatible with each other. If you choose to use a different version of one of the tools listed here, you will be responsible for debugging issues that are specific to your version.

## Required Technologies

The following technologies are required in order to complete this phase of the program:

- **Eclipse**: We will be using Eclipse as our *integrated development environment* (IDE). Though you don't need an IDE to write code, an IDE provides several features that make rapid development (e.g. quickly writing and refactoring code) easier.
- **DBeaver**: DBeaver is a free, open source universal database tool that is compatible with several external data sources, PostgreSQL included. We'll use DBeaver in order to modify our databases and persist data using a simple user interface provided to us by the tool.

## Installation Method

**NOTE**: This guide primarily is written for those on a Windows Machine. 

This method is compatible with all environments as it does not require any platform-specific package managers. You need only visit the official websites for each of the technologies listed and download the version of the tool that is compatible with your system.

Do note, however, that setting system environment variables differs from machine to machine. This guide shows how to set environment variables on a Windows machine.

The first thing you'll want to do is open your web browser of choice. This guide will use *Chrome*.

**Note**: Many of the tools that you will install have different system installers that are platform dependent. It is **very** important that you download the correct installer. The following list details how you should choose the installer for a program:

- If you have a 32-bit version of Windows, use the installer that is marked as the 32-bit version.
- If you have a 64-bit version of Windows, use the installer that is marked as the 64-bit version.
- If you have a Linux distribution (e.g. Debian, Ubuntu, Red Hat, Fedora), you should choose the installer that matches your distribution.
- If you have a Mac, you should choose the installer that is marked as the Mac installer.

These options will be clearly labeled on the websites you visit to download the technologies. If you're not sure how to figure out what version of the Windows operating system you're running, do the following:

1. Type "Control Panel" into the Windows search bar and click on the "Control Panel" app.
2. Select "System and Security".
3. Select "System".

You should now see the following screen:

![Image of Windows System Settings](./images/windows-system.PNG)

You should see your operating system listed ("Windows 10" in the above example) and the system type listed under the "System" tab (a 64-bit operating system in the above example).


### Step 1: Install Spring Tool Suite 4

1. Navigate to the [Spring Tools](https://spring.io/tools) website and download Spring Tools 4 for Eclipse. 

![](./images/STS-Web.jpg)

2. Once the download has finished go to your downloads folder, search for the spring-tool-suite jar file and double click it to begin the install process. NOTE: STS will install to the directory the jar file is in when you open it. If you would like STS to install to another directory than your downloads directory, move the jar file before opening it.

![](./images/STS-Jar.jpg)

3. An unnamed progress bar will appear as STS is installed into your directory. 

![](./images/STS-Unpack.jpg)

4. Once the install is complete you will have an STS folder in the directory. Double click it to enter it. 

![](./images/STS-Folder.jpg)

5. Once inside the folder double click the SpringToolSuite4 application icon to start STS and ensure it runs correctly. If you encounter any errors check all the path variables you configured in the previous setup guides. 

![](./images/STS-Ready.jpg)

6. If STS opens without errors you will be asked to create a workspace. You can just click "Cancel" at this time. 

7. If you would like to place a shortcut to STS on your desktop (which is highly recommended) you can right-click the SpringToolSuite4 application, hover over "Send to" and click "Desktop (create shortcut)". You will now have a desktop icon from which you can open STS.

![](./images/STS-Shortcut.jpg)
![](./images/STS-Desktop.jpg)


### Step 2: Install DBeaver

In order to install DBeaver, please visit [DBeaver's official website](https://dbeaver.io/download/).

Once you navigate to the website, you should see the following:

![DBeaver Home](./images/dbeaver-home.PNG)

You'll notice that there are two options: Community Edition and Enterprise Edition. Please select the **Community Edition** as it is free. Do NOT select the Enterprise as it is not free.

You will find the installers for the Community Edition if you scroll down the page. They should be located directly beneath the the box which says "Community Edition 7.1.1". As with all other software listed here, please make sure that you choose the correct installer for your system.

Once you've clicked on the installer that is compatible with your system, you'll be prompted to save the file. Save it and note where you've saved it on your machine. These files are usually stored in your computer's "Downloads" folder by default.

![Save DBeaver Installer](./images/dbeaver-installer.PNG)

Now navigate to the folder where the installer is stored. For this example, we've downloaded the file to the "Downloads" folder.

![Installer In Downloads Folder](./images/dbeaver-download.PNG)

Double click the installer. Once you've done so, the installer will be launched. The installer should take you through the process of setting up DBeaver. You'll be asked, for instance, to select a language of choice and review license terms before you install the software.

![DBeaver License Agreement](./images/dbeaver-license.PNG)

When you arrive at the portion of the setup which is titled "Choose Components", please select "DBeaver Community" and "Associate .SQL files".

![DBeaver Components](./images/dbeaver-components.PNG)

If your installation was successful, you should now be able to search for and find "DBeaver" using your computer's search bar.

====================

*  **Java Docs** (The official API specification for Java 8): https://docs.oracle.com/javase/8/docs/api/


