#SmoothCheckBox



## Intro

- This repo is Forked [here](https://github.com/andyxialm/SmoothCheckBox)
- migrate `kotlin`
- add custom attribute
- Origin license [here](https://github.com/andyxialm/SmoothCheckBox/blob/master/README.md#license)



## How To Use

[![](https://jitpack.io/v/lhoyong/SmoothCheckBox.svg)](https://jitpack.io/#lhoyong/SmoothCheckBox)



1. Add it in your root `build.gradle` at the end of repositories:

~~~~groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
~~~~

2. Add the `dependency`

~~~~groovy
dependencies {
	        implementation 'com.github.lhoyong:SmoothCheckBox:1.0.0'
	}
~~~~



### ScreenShot 

![](https://github.com/andyxialm/SmoothCheckBox/blob/master/art/smoothcb.gif?raw=true)

### Attrs
|attr|format|description|
|---|:---|:---:|
|duration|integer|set animation duration|
|stroke_width|dimension|stroke width|
|color_tick|color|tick color|
|color_checked|color|Checked color|
|color_unchecked|color|un checked color|
|color_unchecked_stroke|color|un checked storke color|
|stroke_enable|boolean|Check box stroke enable (default: false)|



## Sample Usage 


```kotlin
 
    setChecked(checked: Boolean)                 
    setChecked(checked: Boolean, animate: Boolean)  
```


```kotlin

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        scb.setOnCheckedChangeListener(object : SmoothCheckBox.OnCheckedChangeListener {
            override fun onCheckedChanged(checkBox: SmoothCheckBox, isChecked: Boolean) {
                Log.d("SmoothCheckBox", isChecked.toString())
            }
        })
    }
```



## License

    Copyright 2019 lhoyong
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.