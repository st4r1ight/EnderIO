---
navigation:
    title: Grains of Infinity
    icon: grains_of_infinity
    parent: enderio:resources_index.md
item_ids:
    - enderio:grains_of_infinity
categories: 
    - Resources
---
# Grains of Infinity
<ItemImage id="grains_of_infinity" scale="6" />
**Grains of Infinity** are small fragments of the eternity that lies beneath the bedrock of the world. They are an essential crafting ingredient used to make machines.

To obtain them, light bedrock or deepslate on fire and stand back.

<GameScene zoom="3">
    <Block id="minecraft:bedrock" />
    <Block y="1" id="minecraft:fire" />
    <Block x="2" id="minecraft:deepslate" />
    <Block x="2" y="1" id="minecraft:fire" />
</GameScene>

<GameScene zoom="4">
    <Block id="minecraft:bedrock" />
    <Block x="2" id="minecraft:cobblestone" />
    <Entity y="1" id="minecraft:item" data="{Item: {id:'enderio:grains_of_infinity'}}" />
    <Entity x="2.75" y="1" id="minecraft:item" data="{Item: {id:'enderio:grains_of_infinity'}}" />
</GameScene>
It works even if fireTick is disabled!

If you ever lose this guide, you can craft another one using Grains of Infinity and a book.
<RecipeFor id="enderio:guide" />
