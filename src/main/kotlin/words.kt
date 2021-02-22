val words = setOf(
    Word("Adventure"),
    Word("Age"),
    Word("Agent"),
    Word("Alliance"),
    Word("Amulet"),
    Word("Angel"),
    Word("Anger"),
    Word("Archer"),
    Word("Arena"),
    Word("Armor"),
    Word("Arrow"),
    Word("Assassin"),
    Word("Avalon", ""),
    Word("Bandit"),
    Word("Bane", ""),
    Word("Banshee"),
    Word("Bard"),
    Word("Battle"),
    Word("Battlefield"),
    Word("Beholder"),
    Word("Black", ""),
    Word("Blade"),
    Word("Blood", ""),
    Word("Bomb"),
    Word("Bond"),
    Word("Bone"),
    Word("Book"),
    Word("Bracer"),
    Word("Bridge"),
    Word("Call"),
    Word("Cape"),
    Word("Castle"),
    Word("Catacomb"),
    Word("Cauldron"),
    Word("Cave"),
    Word("Centaur"),
    Word("Chain"),
    Word("Chaos", ""),
    Word("Chariot"),
    Word("Charm"),
    Word("Child", "ren"),
    Word("Chimera"),
    Word("Chronicle"),
    Word("Circle"),
    Word("Clan"),
    Word("Clash", "es"),
    Word("Cloud"),
    Word("Conquest"),
    Word("Contest"),
    Word("Coven"),
    Word("Covenant"),
    Word("Creed"),
    Word("Crest"),
    Word("Crown"),
    Word("Crusade"),
    Word("Dagger"),
    Word("Darkness", ""),
    Word("Defeat", ""),
    Word("Defender"),
    Word("Defense", ""),
    Word("Demon"),
    Word("Desire"),
    Word("Despair"),
    Word("Destiny", pluralOverride = "Destinies"),
    Word("Destroyer"),
    Word("Devil"),
    Word("Dominion"),
    Word("Dragon"),
    Word("Duel"),
    Word("Dungeon"),
    Word("Dust"),
    Word("Dynasty", pluralOverride = "Dynasties"),
    Word("Edge", ""),
    Word("Elf", pluralOverride = "Elves"),
    Word("Emperor"),
    Word("Empire"),
    Word("Endless", ""),
    Word("Epic"),
    Word("Era"),
    Word("Eternal"),
    Word("Eye"),
    Word("Fairy", pluralOverride = "Fairies"),
    Word("Fantasy", pluralOverride = "Fantasies"),
    Word("Fate"),
    Word("Feast"),
    Word("Fervor"),
    Word("Fire"),
    Word("Flame"),
    Word("Flesh", ""),
    Word("Force"),
    Word("Forest"),
    Word("Fortune"),
    Word("Gambit"),
    Word("Galaxy", pluralOverride = "Galaxies"),
    Word("Game"),
    Word("Gauntlet"),
    Word("Ghost"),
    Word("Gladiator"),
    Word("Gloom", ""),
    Word("Glory", pluralOverride = "Glories"),
    Word("Glyph"),
    Word("Goblet"),
    Word("Goblin"),
    Word("God"),
    Word("Goddess", "es"),
    Word("Gold"),
    Word("Golem"),
    Word("Grave"),
    Word("Guardian"),
    Word("Guest"),
    Word("Gun"),
    Word("Gypsy", pluralOverride = "Gypsies"),
    Word("Harbinger"),
    Word("Heart"),
    Word("Hero", "es"),
    Word("Horde"),
    Word("Hunter"),
    Word("Hydra"),
    Word("Iron"),
    Word("Ice", ""),
    Word("Illusion"),
    Word("Jewel"),
    Word("Joy"),
    Word("Keep", ""),
    Word("Key"),
    Word("King"),
    Word("Kingdom"),
    Word("Kiss", "es"),
    Word("Knight"),
    Word("Lady", pluralOverride = "Ladies"),
    Word("Lair"),
    Word("League"),
    Word("Legend"),
    Word("Legion"),
    Word("Lightning"),
    Word("Limit"),
    Word("Lion"),
    Word("Lord"),
    Word("Magic", ""),
    Word("Mask"),
    Word("Mercy", ""),
    Word("Mind"),
    Word("Mobile", ""),
    Word("Monster"),
    Word("Moon"),
    Word("Mystery", pluralOverride = "Mysteries"),
    Word("Night"),
    Word("Noble"),
    Word("Oath"),
    Word("Ogre"),
    Word("Omen"),
    Word("Oracle"),
    Word("Orb"),
    Word("Orc"),
    Word("Order", ""),
    Word("Overlord"),
    Word("Paladin"),
    Word("Pegasus", "es"),
    Word("Phantom"),
    Word("Pharaoh"),
    Word("Phoenix", "es"),
    Word("Pirate"),
    Word("Plague"),
    Word("Plot"),
    Word("Poem"),
    Word("Poison"),
    Word("Portal"),
    Word("Potion"),
    Word("Prayer"),
    Word("Priest"),
    Word("Priestess", "es"),
    Word("Prince"),
    Word("Princess", "es"),
    Word("Prison"),
    Word("Prize"),
    Word("Promise"),
    Word("Prophecy", pluralOverride = "Prophecies"),
    Word("Quest"),
    Word("Quiver"),
    Word("Raid"),
    Word("Realm"),
    Word("Reign"),
    Word("Rift"),
    Word("Ring"),
    Word("Rise", ""),
    Word("Road"),
    Word("Ronin"),
    Word("Rose"),
    Word("Rule"),
    Word("Rune"),
    Word("Sacrifice"),
    Word("Saint"),
    Word("Samurai", ""),
    Word("Savior"),
    Word("Scroll"),
    Word("Sea"),
    Word("Seven", ""),
    Word("Sewer"),
    Word("Shadow"),
    Word("Shield"),
    Word("Sin"),
    Word("Siren"),
    Word("Skill"),
    Word("Skull"),
    Word("Snow"),
    Word("Soldier"),
    Word("Son"),
    Word("Song"),
    Word("Soul"),
    Word("Spell"),
    Word("Spike"),
    Word("Squire"),
    Word("Stalker"),
    Word("Star"),
    Word("Steel", ""),
    Word("Stone"),
    Word("Storm"),
    Word("Strategy", pluralOverride = "Strategies"),
    Word("Succubus", "es"),
    Word("Sultan"),
    Word("Summoner"),
    Word("Sun"),
    Word("Sword"),
    Word("Tactics", ""),
    Word("Tale"),
    Word("Thief", pluralOverride = "Thieves"),
    Word("Thought"),
    Word("Throne"),
    Word("Thunder"),
    Word("Tiara"),
    Word("Time"),
    Word("Titan"),
    Word("Tomb"),
    Word("Tome"),
    Word("Tower"),
    Word("Treasure"),
    Word("Trial"),
    Word("Tribe"),
    Word("Troll"),
    Word("Unicorn"),
    Word("Universe"),
    Word("Victor"),
    Word("Victory", pluralOverride = "Victories"),
    Word("Void"),
    Word("War"),
    Word("Warlock"),
    Word("Warrior"),
    Word("Wheel"),
    Word("Witch", "es"),
    Word("Wizard"),
    Word("Wolf", pluralOverride = "Wolves"),
    Word("Wonder"),
    Word("World"),
    Word("Wyvern"),

    // Modifiers
    Word("Dark {s}", pluralOverride = "Dark {p}"),
    Word("Enchanted {s}", pluralOverride = "Enchanted {p}"),
    Word("Evil {s}", pluralOverride = "Evil {p}"),
    Word("Final {s}", pluralOverride = "Final {p}"),
    Word("Forgotten {s}", pluralOverride = "Forgotten {p}"),
    Word("Goblin {s}", pluralOverride = "Goblin {p}"),
    Word("Good {s}", pluralOverride = "Good {p}"),
    Word("Last {s}", pluralOverride = "Last {p}"),
    Word("Lost {s}", pluralOverride = "Lost {p}"),
    Word("Wooden {s}", pluralOverride = "Wooden {p}"),
    Word("{s}breaker"),
    Word("{s}hearted", ""),
    Word("{s}-hunter"),
    Word("{s}keeper"),
    Word("{s}rider"),
    Word("{s}-seeker")
)
