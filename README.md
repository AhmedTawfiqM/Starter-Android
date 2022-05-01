![Message](https://img.shields.io/static/v1?label=Android&message=Project&color=green)
![License](https://img.shields.io/badge/License-Apache-blue.svg)

**Starter Android**  is a Codebase for your Android Project with Clean Architecture and Modular Architecture  , the Codebase contains all abstraction and Infrastructure u need to build Complex Apps.

<p align="center">
<img src="https://github.com/AhmedTawfiqM/starter-android-library/blob/master/logo.png" alt="AndroidLibray"/>
</p>

# Table of contents

- [Description](#Description)
- [Software Stack](#Stack)
- [Why](#why)
- [Installation](#installation)


## Description
- all Components of Project are Completely Reusable.
- The project depends on Navigation Jetpack Compose, u can build seperated Navigation Host with related screens.
- There is Factory to create awesome NavHost to build related Screens. 
- support Error Handling with scope of App. 
- contains AppViewModel: abstraction for viewmodels .
- contains CoroutinesRequester: for handling all your requests .
- contains AppSCreen: abstraction layer of your screens by Navigation Compose.
- contains NavControllerHost: manage hosing between screens.

## Software Stack
- Kotlin <br/>
- MVVM  
- Android JetPack 
- Retrofit 2 
- Hilt dagger (U can replace with Koin if needed)
- Coroutines
- jetpack Compose 
- Navigation Compose 
- Clean Architecture 
- Modular Architecture (domain - adata - presenatation) layers
- Used Design Patterns: Startegy , Templete Method , Factory , SingleTon Patterns.

<br/>
<img src="https://github.com/AhmedTawfiqM/Albums/blob/master/clean_arch.png" alt="clean-architecture"/>

# Why Modular Architecture ?

- The Project is Clean , Testable , Maintainable and changable
- High quality App with high cohesion and low coupling
- Build Time 
- Development Can be Divided
- Readable Programs
- Programming Errors are Easy to Detect
- Allows Re-Use of Codes
- Improves Manageability
- Collaboration


# Installation

1. clone the project in android studio
2. change applicationID (packageName ) as you like.
3. change the app ame.
4. may need to sync , clean then rebuild the project.

## :clap: Contribution

- PRs are welcome, let's make this library better. :raised_hands:

- please :star: if you like the idea!


## Check my last lecture about Clean architecture and Clean Code [Lecture](https://www.youtube.com/watch?v=kFll5whDTJc&t=759s&ab_channel=AHMEDTAWFIQ)

## License

**Apache License**, Version 2.0

<details>
    <summary>
        click to reveal License
    </summary>

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
   https://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

</details>
