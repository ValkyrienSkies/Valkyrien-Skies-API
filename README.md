# Valkyrien-Skies-API

[![Build Status](https://jenkins.daporkchop.net/job/ValkyrienSkies/job/Valkyrien-Skies-API/job/master/badge/icon)](https://jenkins.daporkchop.net/job/ValkyrienSkies/job/Valkyrien-Skies-API/job/master/)
[![Discord](https://img.shields.io/discord/244934352092397568.svg)](https://discord.gg/rG3QNDV)

A simple API providing helper functions to allow other mods to easily interact with Valkyrien Skies.

To add VW API to your mod do the following:  
Add this to Maven repositories:  
```groovy
maven {
    name = "DaPorkchop_"
    url = "https://maven.daporkchop.net/"
}
```

Add this to dependencies:  
```groovy
compile "org.valkyrienskies:api:1.0.0.9"
```

As with any API, packaging and redistributing this API within your mod is strongly discouraged.

