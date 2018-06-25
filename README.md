# Valkyrien-Warfare-API
A simple API providing helper functions to allow other mods to easily interact with Valkyrien Warfare.

To add VW API to your mod do the following:
  Add this to Maven repositories:
  maven {
		url 'https://maven.daporkchop.net/'
	}
  Add this to dependencies:
  compile 'valkyrienwarfare:api:1.0'
  And add this to your build task:
  include(dependency('valkyrienwarfare:api'))

You are allowed to redistribute and package the code of the API within your mod.
