---
layout: index
title: googleMapsUtils
---

Using the library is simple.

Clone it from github like this

	Davys-MacBook-Air:workspace2 ddewaele$ git clone https://github.com/googlemaps/android-maps-utils.git
	Cloning into android-maps-utils...
	remote: Counting objects: 183, done.
	remote: Compressing objects: 100% (102/102), done.
	remote: Total 183 (delta 58), reused 160 (delta 35)
	Receiving objects: 100% (183/183), 304.71 KiB | 333 KiB/s, done.
	Resolving deltas: 100% (58/58), done.

This will give you a complete copy of the project on your filesystem. I've clones the repository in a location that is outside my eclipse workspace.
See later on why.

Next step is to import the code in our ADT.

###Import the code in ADT.

When importing code in ADT it's always best to import code from a location that's outside your standard eclipse workspace.
Otherwise you might run into the following error 

[INSERT ERROR HERE]

We'll import the code as  existing Android code.

[INSERT screenshot]

After importing the code you should see the project in your ADT. You'll notice it still has a couple of errors.

[INSERT screenshot]

We need to add a reference to the Google Play Services library project. 

[INSERT link to article explaining that]

Next up is to reference the android-maps-utils Library project on our project.

[INSERT screenshot] 


##References

[0]: http://www.youtube.com/watch?feature=player_embedded&v=nb2X9IjjZpM#!
[1]: https://github.com/googlemaps/android-maps-utils
[2]: https://developers.google.com/live/shows/585386324 "Fireside Chat with the Google Maps Team"
[3]: https://developers.google.com/places/training/autocomplete-android
[4]: https://developers.google.com/maps/documentation/directions/

https://code.google.com/p/android-maps-extensions/
http://www.jsoneditoronline.org/
https://github.com/cyrilmottier/Polaris2
