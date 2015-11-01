public class PLAN {
    
Planning for program.

Create character.
Character generates attributes automatically.
These are assigned into an array.

The class is then selected and it is given a type depending on class.

This will be used to determine the assigning of the attributes.

Attributes {
 0 - STR
 1 - DEX
 2 - CON
 3 - INT
 4 - WIS
 5 - CHA
}

Races:

Name||attribute.num,attribute.num,attribute.num||SPEED||rule#rule#rule||language,language,(optional),(optional)

- Basic {
    - Dwarf {
        - Attributes {
            - +2 WIS
            - +2 CON
            - -2 CHA
        }
        - Other {
            - Slow and Steady
                = Slower movement unaffected by load
            - Darkvision
            - +2 Appraise (Stone)
            - +2 v greenskins
            - +2 save v poison
            - +2 Perception stone work
            - Weapon proficiency with pick axes and anything "Dwarven"
        }
        - Languages {
            - Dwarven
            - Common
            - (Orcish)
            - (Goblin)
            - (Troll)
            - (Terran)
        }
    }
    - Elf {
        - Attributes {
            - +2 DEX
            - +2 INT
            - -2 CON
        }
        - Other {
            - Low-Light vision
            - Elven immunities
                = +2 v enchantment and sleep
            - +2 Perception
            - Weapon proficiency longbows, longswords, rapiers and shortbows.
        }
        - Languages {
            - Elven
            - Common
            - (Sylvan)
        }
    }
    - Gnome {
        - Attributes {
            - +2 CON
            - +2 CHA
            - -2 STR
        }
        - Other {
            - Small
            - Low-Light vision
            - +4 dodge v Giants
            - +1 Illusions spells
                = Spell like abilities
            - Hatred - Reptillian and Goblinoids
            - +2 v illusions
            - +2 Perception
            - +2 Craft or profession
            - Weapon familiarity "Gnome"
        }
        - Languages {
            - Gnomish
            - Common
            - (Elven)
            - (Draconic)
            - (Sylvan)
            - (Giant)
            - (Orc)
        }
    }
    - Half-Elf {
        - Attributes {
            - +2 ANY
        }
        - Other {
            - Low-light vision
            - Skill focus bonus feat
            - Elf and Human blood
            - +2 perception
        }
        - Languages {
            - Human
            - Elven
            - (Dwarf)
            - (Sylvan)
            - (Orc)
        }
    }
    - Halfling {
        - Attributes {
            - +2 DEX
            - +2 CHA
            - -2 STR
        }
        - Other {
            - Small
            - +2 v Fear
            - +1 on rolls OR 1 re-roll per day/encounter
            - +2 Hide, move silently
            - +2 climb
            - Weapon proficiency sling, "Halfling"}
        - Languages {
            - Halfling
            - Common
            - (Dwarven)
            - (Goblin)
            - (Gnome)
            - (Elven)
        }
    }
    - Human {
        - Attributes {
            - +2 Any
        }
        - Other {
            - +1 feat
            - +1 Skill/level
            - Common, accepted
        }
        - Languages {
            - Common
            - (Dwarven)
            - (Elven)
        }
    }
}
- Untrusted {
    - Elemental-Kin {
        - Ifrit {
            - Attributes {
                - +2 DEX
                - +2 CHA
                - -2 WIS
            }
            - Other {
                Darkvision:
                Ifrits can see in the dark up to 60 feet.
                Spell-Like Ability:
                    Produce Flame 1/day (caster level equals the ifrits total level).
                Elemental Resistance:
                    Ifrits have fire resistance equal to their level.
                Hot-Blooded
                    Ifrit are not adversely affected by any weather conditions.
                Quickdraw feat.
            }
            - Languages {
                - Common
                - Ignan
            }
        }
        - Oread {
            - Attributes {
                - +2 STR
                - +2 WIS
                - -2 CHA
            }
            - Other {
                Darkvision:
                Oreads can see in the dark up to 60 feet.
                Spell-Like Ability:
                    Stone Shape 1/day (caster level equals the oreads level).
                Elemental Resistance:
                    Oreads have acid resistance equal to their level.
                Natural Armour
                    AC +1 (+1 for every 5 levels)
            }
            - Languages {
                - Common
                - Terran
            }
        }
        - Sylph {
            - Attributes {
                - +2 DEX
                - +2 INT
                - -2 CON
            }
            - Other {
                Darkvision:
                Sylphs can see in the dark up to 60 feet.
                Sylph Magic:
                    Feather fall 1/day (caster level equals the sylphs level).
                Elemental Resistance:
                    Sylphs have electricity resistance equal to their level.
                Listen to the Wind
                    +4 Listen, move Silently
                Gentle Breeze
                    Reduces fall damage taken by 10ft (+5 ft every 5 levels)
            }
            - Languages {
                - Common
                - Auran
            }
        }
        - Undine {
            - Attributes {
                - +2 DEX
                - +2 WIS
                - -2 STR
            }
            - Other {
                Undines have a swim speed of 30 feet.
                Darkvision up to 60 feet.
                Spell-Like Abilities:
                    Hydraulic push* 1/day. (Caster level equals the undines total level.)
                Elemental Resistance:
                    Undines have cold resistance equal to their level.
                +8 Swim, Can breathe Underwater
            }
            - Languages {
                - Common
                - Aquan
            }
        }
    }
    - Aasimar {
        - Attributes {
            - +2 CHA
            - +2 WIS
        }
        - Other {
            - +2 Perception, +2 Diplomacy
            - Darkvision 60ft
            - Spell-like ability
                = Daylight once per day
            - Celestial Resistance
                = Acid resist 5, Cold resist 5, and Electricity resist 5
            - Native outsider
        }
        - Languages {
            - Common
            - Celestial
        }
    }
    - Centaur {
        - Attributes {
            - +4 STR
            - +4 WIS
            - +2 CON
            - -2 CHA
        }
        - Other {
            - LARGE
            - +1 Will, -2 Ref, +2 Fort
            - +1 AC armour, -1 AC touch
            - Bonus feat: Proficiency(longbow)
            - -4 Armour penalty to skills.
            - -4 stealth
            - darkvision 60ft
            - Speed 40ft
            - Quadruped
        }
        - Languages {
            - Sylvan
            - (Elven)
            - (Common)
        }
    }
    - Dragonborn {
        - Attributes {
            - +2 Str
            - +2 Con
            - -2 Dex
        }
        - Other {
            - Type {
                Can choose type and 5 + lvl resistance (And weakness) to:

                Evil:                Good:
                Black (Acid)    /    Bronze (Electricity)
                White (Cold)    /    Gold (Fire)
                Blue (Electric)    /    Silver    (Cold)
                Green (Poison)    /    Copper    (Acid)
                Red (Fire)        /     Brass (Poison)

                - Breath Weapon
                    (1d4 per level, 5ft + 5ft per 5 levels, Same as type)
                    Can be used once per day per 5 levels.
            }
            - +2 Intimidate, +2 Appraise
            - +1 AC
            - Humanoid and Dragon-type
            - Immune to frightful Presence
            - Claws
                = 1d4 slashing damage.
        }
        - Languages {
            - Draconic
            - Common
        }
    }
    - Drow {
        - Attributes {
            - +2 DEX
            - +2 CHA
            - -2 CON
        }
        - Other {
            - +2 Intimidate, +1 Hide, +1 Move silently
            - Darkvision 120
            - Light blindness
                = Abrupt exposure to bright light blinds drow for 1 round; on subsequent rounds, they are dazzled as long as they remain in the affected area.
            - Drow Immunities
                = Drow are immune to magic sleep effects and gain a +2 racial bonus on saving throws against enchantment spells and effects.
            - Spell-Like Abilities
                = A drow can cast dancing lights, darkness, and faerie fire, once each per day, using her total character level as her caster level.
            - Spell resistance equal to 6 plus their class levels
            - +2 perception
            - Drow are proficient with the hand crossbow, rapier, and short sword.
            - Ancestral Grudge
                = The enmity between the drow and elves and dwarves is long-standing and deeply entrenched.
                Drow with this racial trait gain a +1 bonus on attack rolls against humanoids with the dwarf or elf subtypes
                (with the exception of drow) because of their special training against these reviled foes.
        }
        - Languages {
            - Undercommon
            - Elven
            - (Common)
        }
    }
    - Half-Orc {
        - Attributes {
            - +2 any
        }
        - Other {
            - Darkvision
            - +2 Intimidate
            - Orc and human blood
            - Fight while downed (1 round)
            - Weapon familiarity Great-axe, falchion and "Orc"
        }
        - Languages {
            - Orc
            - Common
        }
    }
    - Tiefling {
        - Attributes {
            - +2 INT
            - +2 DEX
            - -2 CHA
        }
        - Other {
            - +2 Bluff, stealth
            - Darkvision
            - Spell-like ability
                = Darkness once per day
            - Fiendish Resistance
                = Fire resist 5, Cold resist 5, and Electricity resist 5
            - Fiendish Sorcery
                = Tiefling sorcerers with the Abyssal or Infernal bloodlines treat their Charisma score as 2 points higher for all sorcerer class abilities.
        }
        - Languages {
            - Common
            - Infernal or Abyssal
        }
    }
    - Wyrwood {
        - Attributes {
            - +2 STR
            - +2 INT
            - -2 CHA
            - 0 CON
        }
        - Other {
            - No need to eat, drink, sleep, or breathe.
            - low-light vision
            - darkvision 60ft
            - Immune to disease, poison, fatigue, exhaustion, energy drain, bleed, and sleep effects.
            - Immune to mind-altering effects.
            - cannot be healed. Can be repaired.
            - +20 hp
            - Inert at <0 hit points.
                = Unconscious. Does not bleed out.
            - Fully rested at 4 hours. Must recharge periodically. Does not regenerate health.
        }
        - Languages {
            - Common
        }
    }
}
- Monster {
    - Dhampir {
        - Attributes {
            - +2 DEX
            - +2 CHA
            - -2 CON
        }
        - Other {
            - Darkvision 60 and low-light vision
            - +2 Bluff, perception
            - +2 vs. disease
            - Resist necrotic equal to level
            - No penalties from energy draining effects
            - Choice {
                - Fangs
                    = 1d3 bite attack when grappling or against helpless opponents.
                - Light sensitivity: dazzled in bright light.
                - React to positive and negative energy as though undead.
                OR
                - Spell-Like Ability
                    = A dhampir can use detect undead three times per day as a spell-like ability.
                }
        }
        - Languages {
            - Common
        }
    }
    - *Gnoll {
        - Attributes {
            - +4 STR
            - +2 CON
            - -2 INT
            - -2 CHA
        }
        - Other {
            - +3 Fort
            - +8 hp
            - +1 Armour
            - Darkvision
        }
        - Languages {}
        - Favoured Class {}
        - Common Deities {}
    }
    - Goblin {
        - Attributes {
            - +4 Dex
            - -2 Str
            - -2 Cha
        }
        - Other {
            - Small
            - 30ft speed
            - Darkvision 60
            - +4 ride and stealth
            - Weapon Familiarity: "Goblin"
            - Fire Hand
                = Can wield a torch as a weapon without taking the nonproficient penalty and gain a +1 bonus on attack rolls with melee weapons that deal fire damage.
        }
        - Languages {
            - Goblin
            - (Common)
        }
    }
    - Hobgoblin {
        - Attributes {
            - +2 Dex
            - +2 Con
        }
        - Other {
            - Darkvision 60
            - Goblin
            - +4 Intimidate
            - +1 CMD
        }
        - Languages {
            - Goblin
            - Common
        }
    }
    - Kobold {
        - Attributes {
            - +2 Dex
            - -4 Str
            - -2 Con
        }
        - Other {
            - Small
            - 30 speed
            - Darkvision 60
            - +1 AC Natural Armour
            - +2 racial bonus on Craft (trapmaking), Perception, and Profession (miner) checks. Craft (traps) and Stealth are always class skills for a kobold.
            - +4 Stealth
            - Light sensitivity: Dazzled in bright light
        }
        - Languages {
            - Draconic
            - (Common)
        }
    }
    - Orc {
        - Attributes {
            - +4 Str
            - -2 Int
            - -2 Wis
            - -2 Cha
        }
        - Other {
            - Darkvision
            - Light sensitivity
            - Ferocity:
                = Orcs can remain conscious and continue fighting even if their hit point totals fall below 0.
                Orcs are still staggered at 0 hit points or lower and lose 1 hit point each round as normal.
            - Orcs are always proficient with greataxes and falchions, and treat any weapon with the word "orc" in its name as a martial weapon.
        }
        - Languages {
            - Orc
            - (Common)
        }
    }
    - Ratfolk {
        - Attributes {
            - +2 Dex
            - +2 Int
            - -2 Str
        }
        - Other {
            - Small
            - 20 speed
            - Darkvision 60
            - +4 Handle Animal
            - +2 racial bonus on Craft (alchemy), Perception, and Use Magic Device checks.
            - scent ability, but take a –2 penalty on all Perception checks based primarily on sight or hearing.
        }
        - Languages {
            - Common
        }
    }
    - Samsaran {
        - Attributes {
            - +2 INT
            - +2 WIS
            - -2 CON
        }
        - Other {
            - 30 speed
            - low-light vision
            - +2 on saves to resist death
                = includes negative levels and stabilising
            - Spell-like abilities
                = 1/day - comprehend languages, Deathwatch, and Stabilisei
        }   - +2 bonus on 2 skills (also treadted as class skills)
        - Languages {
            - Common
            - Samsaran
        }
    }
}

Classes:
- Adept{
    - Good {
        - Healer {
            - Equipment {
                - Melee Weapon {
                    - Quarterstaff
                }
                - Ranged Weapon {
                    - None
                }
                - Other {
                    - Wand of cure
                    - Scrolls of cure
                    - Holy Symbol
                    - Healers Kit
                    - Potions of cure
                    - Waterskin
                    - Bandages
                    - Pouch of herbs
                    - Chirurgeons Kit
                }
            }
            - Stat Order {
                - Wis
                - Cha
                - Int
                - Con
                - Dex
                - Str
            }
            - Skills {
                - Heal
                - Handle Animal
                - Knowledge(Local)
                - Knowledge(Nature)
                - Profession(Herbalist)
                - Survival
            }
            - Feats {
                Scribe Scroll
                Skill Focus(Heal)
                Brew Potion
                Iron Will
                Fast Healer
                Lay on Hands
                Combat Casting
                Self Sufficient
            }
            - Spells {
                - Level 0 {
                    - Stabilise
                    - Create Water
                    - Purify food and drink
                }
                - Level 1 {
                    - Cure light wounds
                    - Grace
                    - Bless
                    - Bless Water
                    - Deathwatch
                    - Sanctuary
                    - Shield of Faith
                }
                - Level 2 {
                    - Cure moderate wounds
                    - Bestow Grace
                    - Paladins Sacrifice
                    - Sacred Bond
                    - Share Language
                    - Gentle Repose
                    - Delay Poison
                    - Status
                }
                - Level 3 {
                    - Cure Serious Wounds
                    - Divine Transfer
                    - Remove Curse
                    - Dispel Magic
                    - Remove Curse
                    - Remove Disease
                    - Symbol of Healing
                }
                - Level 4 {
                    - Cure Critical Wounds
                    - Kings Castle
                    - Oath of Peace
                    - Sacrificial Oath
                    - Restoration
                    - Neutralise Poison
                }
                - Level 5 {
                    - Cure Light Wounds, Mass
                    - Cleanse
                    - Heal
                    - Break Enchantment
                    - Breath of Life
                    - Raise Dead
                }
            }
        }
        - Priest {
            - Equipment {
                - Melee Weapon {
                    - Light mace (Rod)
                    - Battle aspergillum
                }
                - Ranged Weapon {
                    - None
                }
                - Other {
                    - Holy Water
                    - Holy Symbol
                    - Clerics Kit
                }
            }
            - Stat Order {
                - Wis
                - Cha
                - Con
                - Int
                - Dex
                - Str
            }
            - Skills {
                - Heal
                - Profession (Priest)
                - Spellcraft
                - Diplomacy
                - Knowledge (Religion)
                - Knowledge (Local)
                - Knowledge (Nobility)
                - Knowledge (History)
                - Gather Information
            }
            - Feats {
                Scribe Scroll
                Skill Focus(Heal)
                Iron Will
                Endurance
                Leadership
                Persuasive
                Combat Casting
                Channel Energy
                Spell Focus
            }
            - Spells {
                - Level 0 {
                    - Create Water
                    - Light
                    - Guidance
                    - Stabilise
                }
                - Level 1 {
                    - Bless
                    - Bless Water
                    - Command
                    - Cure Light Wounds
                    - Detect Evil
                    - Protection From Evil
                    - Shield of Faith
                    - Magic Weapon
                }
                - Level 2 {
                    - Aid
                    - Cure Moderate Wounds
                    - Align Weapon
                    - Eagles Splendour
                    - Owls Wisdom
                    - Consecrate
                    - Zone of Truth
                }
                - Level 3 {
                    - Create Food and Water
                    - Cure Serious Wounds
                    - Daylight
                    - Prayer
                    - Remove Curse
                    - Searing Light
                }
                - Level 4 {
                    - Cure Critical Wounds
                    - Dismissal
                    - Divination
                    - Divine Power
                    - Restoration
                    - Tongues
                    - Magic Weapon, Greater
                    - Holy Smite
                }
                - Level 5 {
                    - Atonement
                    - Commune
                    - Disrupting Weapon
                    - Dispel Evil
                    - Hallow
                    - Summon Angel
                }
            }
        }
        - Holy Initiate {
            - Equipment {
                - Melee Weapon {
                    - Light Mace
                    - Light Shield
                    - Quarterstaff
                    - Dagger
                    - Heavy Mace
                    - Heavy Shield
                }
                - Ranged Weapon {
                    - Sling
                    - Crossbow
                }
                - Other {
                    - Clerics Kit
                    - Chain Shirt
                    - Scale mail
                    - Chainmail
                }
            }
            - Stat Order {
                - Wis
                - Dex
                - Str
                - Con
                - Int
                - Cha
            }
            - Skills {
                Skill focus(Heal)
                Knowledge (Religion)
                Diplomacy
                Survival
                Perception
            }
            - Feats {
                Run
                Shield Specialisation
                Toughness
                Iron Will
                Shield Slam
                Weapon Focus(Light Mace)
            }
            - Spells {
                - Level 0 {
                    - Light
                    - Purify Food and Drink
                }
                - Level 1 {
                    - Detect Evil
                    - Protection from Evil
                    - Bless
                    - Divine Favor
                    - Magic Weapon
                }
                - Level 2 {
                    - Aid
                    - Align Weapon
                    - Bulls Strength
                    - Status
                }
                - Level 3 {
                    - Daylight
                    - Dispel Magic
                    - Prayer
                    - Searing Light
                    - Magic Vestement
                }
                - Level 4 {
                    - Magic Weapon, Greater
                    - Holy Smite
                    - Divine Power
                    - Spell Immunity
                }
                - Level 5 {
                    - Atonement
                    - Disrupting Weapon
                    - Hallow
                    - Commune
                    - Righteous Might
                }
            }
        }
        - Missionary {
            - Equipment {
                - Melee Weapon {
                    - Quarterstaff
                    - Dagger
                    - Light Mace
                }
                - Ranged Weapon {
                    - Sling
                }
                - Other {
                    Clerics Kit
                }
            }
            - Stat Order {
                - Wis
                - Cha
                - Con
                - Int
                - Str
                - Dex
            }
            - Skills {
                Survival
                Knowledge(Nature)
                Knowledge(Religion)
                Knowledge(Local)
                Perception
                Diplomacy
                Bluff
                Sense-Motive
            }
            - Feats {
                Iron Will
                Lightning Reflexes
                Self-Sufficient
                Run
                Skill Focus (Survival)
                Nimble Moves
                Mercy Touch
            }
            - Spells {
                - Level 0 {
                    - Light
                    - Mending
                    - Create Water
                    - Purify Food and Drink
                }
                - Level 1 {
                    - Comprehend Language
                    - Divine Favour
                    - Magic Stone
                    - Obscuring Mist
                    - Summon Monster 1
                    - Cure Light Wounds
                }
                - Level 2 {
                    - Aid
                    - Consecrate
                    - Calm Emotions
                    - Make Whole
                    - Remove Paralysis
                    - Summon Monster 2
                }
                - Level 3 {
                    - Continual Flame
                    - Create Food and Water
                    - Daylight
                    - Remove Disease
                    - Water Walk
                    - Summon Monster 3
                }
                - Level 4 {
                    - Air Walk
                    - Control Water
                    - Divine Power
                    - Imbue with Spell ability
                    - Restoration
                    - Tongues
                    - Summon Monster 4
                }
                - Level 5 {
                    - Atonement
                    - Command, Greater
                    - Hallow
                    - Flame Strike
                    - Righteous Might
                    - Summon Monster 5
                    - True Seeing
                    - Insect plague
                }
            }
        }
    }
    - Evil {
        - Cultist{
            - Equipment {
                - Melee Weapon {
                    - Dagger
                    - Shortsword
                    - Sickle
                    - Spiked Club
                }
                - Ranged Weapon {
                    - None
                }
                - Other {
                    - Food supplies
                    - Waterskin
                }
            }
            - Stat Order {
                - Wis
                - Str
                - Con
                - Cha
                - Dex
                - Cha
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Heretic{
            - Equipment {
                - Melee Weapon {
                    - Dagger
                    - Rod or Staff
                }
                - Ranged Weapon {
                    - None
                }
                - Other {
                    - Rod of Destruction
                    - Staff of Souls
                    - Rod of Magic Missile
                    - Staff of Summon Monster
                    - Rod of Suggestion
                    - Staff of Cloudkill
                }
            }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Necromancer{
            - Equipment {
                - Melee Weapon {
                    
                }
                - Ranged Weapon {
                    
                }
                - Other {
                    
                }
            }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Dark Priest{
            - Equipment {
                - Melee Weapon {
                    
                }
                - Ranged Weapon {
                    
                }
                - Other {
                    
                }
            }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
    }
    - Neutral {
        - Bandit Cleric{
            - Equipment {
                - Melee Weapon {
                    
                }
                - Ranged Weapon {
                    
                }
                - Other {
                    
                }
            }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Mercenary Cleric{
            - Equipment {
                - Melee Weapon {
                    
                }
                - Ranged Weapon {
                    
                }
                - Other {
                    
                }
            }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Shaman{
            - Equipment {
                - Melee Weapon {
                    
                }
                - Ranged Weapon {
                    
                }
                - Other {
                    
                }
            }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Druid{
            - Equipment {
                - Melee Weapon {
                    
                }
                - Ranged Weapon {
                    
                }
                - Other {
                    
                }
            }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Court Priest{
            - Equipment {
                - Melee Weapon {
                    
                }
                - Ranged Weapon {
                    
                }
                - Other {
                    
                }
            }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
    }
}
- Aristocrat {
    - Noble {
        - Royalty {
            - King {
                - Puppet King{
                    - Equipment {
                        - Melee Weapon {
                            - Longsword
                            - Dagger
                            - Cane
                            - Sceptre
                        }
                        - Ranged Weapon {
                            NONE
                        }
                        - Other {
                            - Crown
                            - Fancy Clothing
                            - Jewellery
                        }
                    }
                    - Stat Order {
                        - Con
                        - Str
                        - Cha
                        - Dex
                        - Wis
                        - Int
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - War Hero King{
                    - Equipment {
                        - Melee Weapon {
                            - Longsword
                            - Dagger
                        }
                        - Ranged Weapon {
                            NONE
                        }
                        - Other {
                            - Crown
                            - Fancy Clothing
                            - Jewellery
                        }
                    }
                    - Stat Order {
                        STR
                        CON
                        DEX
                        CHA
                        WIS
                        INT
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Young King{
                    - Equipment {
                        - Melee Weapon {
                            - Longsword
                            - Dagger
                        }
                        - Ranged Weapon {
                            NONE
                        }
                        - Other {
                            - Crown
                            - Fancy Clothing
                            - Jewellery
                        }
                    }
                    - Stat Order {
                        DEX
                        STR
                        CHA
                        INT
                        CON
                        WIS
                    }
                    - Skills {

                    }
                    - Feats {
                        MELEE SWORD
                    }
                    - Other {
                        
                    }
                }
                - Evil King{
                    - Equipment {
                        - Melee Weapon {
                            - Sceptre
                            - Dagger
                        }
                        - Ranged Weapon {
                            - Dagger
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        WIS
                        INT
                        CHA
                        DEX
                        STR
                        CON
                    }
                    - Skills {
                        
                    }
                    - Feats {
                        NON-COMBAT
                    }
                    - Other {
                        may have some minor magical ability or items
                    }
                }
                - Genius King{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        INT
                        WIS
                        CHA
                        CON
                        DEX
                        STR
                    }
                    - Skills {
                        
                    }
                    - Feats {
                        NON-COMBAT
                    }
                    - Other {
                        
                    }
                }
                - Kind King{
                    - Equipment {
                        - Melee Weapon {
                            - Dagger
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        CHA
                        WIS
                        INT
                        CON
                        DEX
                        STR
                    }
                    - Skills {
                        
                    }
                    - Feats {
                        NON-COMBAT
                    }
                    - Other {
                        
                    }
                }
                - Mad King{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        INT
                        CON
                        DEX
                        STR
                        WIS
                        CHA
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Old King{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        WIS
                        CHA
                        INT
                        CON
                        STR
                        DEX
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Warmongering King{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        STR
                        CON
                        DEX
                        CHA
                        WIS
                        INT
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Peaceful King{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        CHA
                        INT
                        WIS
                        CON
                        DEX
                        STR
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
            }
            - Queen {
                - Trophy Queen{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        CHA
                        CON
                        DEX
                        STR
                        INT
                        WIS
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Wise Queen{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        WIS
                        INT
                        CHA
                        CON
                        DEX
                        STR
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Gentle Queen{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        CHA
                        CON
                        WIS
                        INT
                        DEX
                        STR
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Crazy Queen{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        DEX
                        STR
                        CON
                        INT
                        CHA
                        WIS
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Old Queen{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        CHA
                        WIS
                        INT
                        CON
                        DEX
                        STR
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - War Queen{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        STR
                        CON
                        INT
                        DEX
                        CHA
                        WIS
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
            }
            - Princess {
                - Warrior Princess{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        STR
                        CON
                        INT
                        DEX
                        CHA
                        WIS
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Trophy Daughter{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        CHA
                        CON
                        DEX
                        STR
                        INT
                        WIS
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Queen to be{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Court Princess{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Usurper Princess{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Scholar Princess{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        INT
                        WIS
                        CHA
                        CON
                        STR
                        DEX
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Bothersome Princess{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
            }
            - Prince {
                - Old Prince {
                    - Loyal{
                        - Equipment {
                            - Melee Weapon {
                                
                            }
                            - Ranged Weapon {
                                
                            }
                            - Other {
                                
                            }
                        }
                        - Stat Order {
                            
                        }
                        - Skills {
                            
                        }
                        - Feats {
                    
                        }
                        - Other {
                            
                        }
                    }
                    - Old Hero{
                        - Equipment {
                            - Melee Weapon {
                                
                            }
                            - Ranged Weapon {
                                
                            }
                            - Other {
                                
                            }
                        }
                        - Stat Order {
                            
                        }
                        - Skills {
                            
                        }
                        - Feats {
                    
                        }
                        - Other {
                            
                        }
                    }
                    - Manipulative{
                        - Equipment {
                            - Melee Weapon {
                                
                            }
                            - Ranged Weapon {
                                
                            }
                            - Other {
                                
                            }
                        }
                        - Stat Order {
                            
                        }
                        - Skills {
                            
                        }
                        - Feats {
                    
                        }
                        - Other {
                            
                        }
                    }
                    - Old Fool{
                        - Equipment {
                            - Melee Weapon {
                                
                            }
                            - Ranged Weapon {
                                
                            }
                            - Other {
                                
                            }
                        }
                        - Stat Order {
                            
                        }
                        - Skills {
                            
                        }
                        - Feats {
                    
                        }
                        - Other {
                            
                        }
                    }
                }
                - Young Prince {
                    - Aspiring{
                        - Equipment {
                            - Melee Weapon {
                                
                            }
                            - Ranged Weapon {
                                
                            }
                            - Other {
                                
                            }
                        }
                        - Stat Order {
                            
                        }
                        - Skills {
                            
                        }
                        - Feats {
                    
                        }
                        - Other {
                            
                        }
                    }
                    - Naive{
                        - Equipment {
                            - Melee Weapon {
                                
                            }
                            - Ranged Weapon {
                                
                            }
                            - Other {
                                
                            }
                        }
                        - Stat Order {
                            
                        }
                        - Skills {
                            
                        }
                        - Feats {
                    
                        }
                        - Other {
                            
                        }
                    }
                    - Curious{
                        - Equipment {
                            - Melee Weapon {
                                
                            }
                            - Ranged Weapon {
                                
                            }
                            - Other {
                                
                            }
                        }
                        - Stat Order {
                            
                        }
                        - Skills {
                            
                        }
                        - Feats {
                    
                        }
                        - Other {
                            
                        }
                    }
                    - Friendly{
                        - Equipment {
                            - Melee Weapon {
                                
                            }
                            - Ranged Weapon {
                                
                            }
                            - Other {
                                
                            }
                        }
                        - Stat Order {
                            
                        }
                        - Skills {
                            
                        }
                        - Feats {
                    
                        }
                        - Other {
                            
                        }
                    }
                }
                - Royal Knight{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Royal Fool{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Royal Usurper{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Royal Scholar{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
                - Royal pain in the ass{
                    - Equipment {
                        - Melee Weapon {
                            
                        }
                        - Ranged Weapon {
                            
                        }
                        - Other {
                            
                        }
                    }
                    - Stat Order {
                        
                    }
                    - Skills {
                        
                    }
                    - Feats {
                
                    }
                    - Other {
                        
                    }
                }
            }
        }
        - Lord {
            - Leader of men{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Fat Cat{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Master of Intrigue{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Rich Idiot{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Supremist{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - War Lord{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
        }
    }
    - Scholar {
        - Rich Merchant{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Librarian{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Professor{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Lawyer{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Judge{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
    }
    - Other {
        - Military Officer {
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Aged General {
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Favoured Individual {
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Royal Servant {
            - Scribe{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Page{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Head Mistress{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Maid{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Quartermaster{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Falconer{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Stable Groom{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
            - Cook{
                - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
                - Stat Order {
                    
                }
                - Skills {
                    
                }
                - Feats {
            
                }
                - Other {
                    
                }
            }
        }
    }
}
- Commoner {
    - Country {
        - Animal Farmer{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Crop Farmer{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Housewife{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Militia{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Lumberjack{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
    }
    - City {
        - Citizen{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Beggar{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Street thug{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Town Watch{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Shopkeeper{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
    }
    - Other {
        - Miner{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Barmaid{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Ruffian{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Thief{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Innkeeper{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
    }
}
- Expert {
    - Blacksmith{
        - Equipment {
            - Melee Weapon {
                
            }
            - Ranged Weapon {
                
            }
            - Other {
                
            }
        }
        - Stat Order {
            
        }
        - Skills {
            
        }
        - Feats {
    
        }
        - Other {
            
        }
    }
    - Baker{
        - Equipment {
            - Melee Weapon {
                
            }
            - Ranged Weapon {
                
            }
            - Other {
                
            }
        }
        - Stat Order {
            
        }
        - Skills {
            
        }
        - Feats {
    
        }
        - Other {
            
        }
    }
    - Jeweller{
        - Equipment {
            - Melee Weapon {
                
            }
            - Ranged Weapon {
                
            }
            - Other {
                
            }
        }
        - Stat Order {
            
        }
        - Skills {
            
        }
        - Feats {
    
        }
        - Other {
            
        }
    }
    - Carpenter{
        - Equipment {
            - Melee Weapon {
                
            }
            - Ranged Weapon {
                
            }
            - Other {
                
            }
        }
        - Stat Order {
            
        }
        - Skills {
            
        }
        - Feats {
    
        }
        - Other {
            
        }
    }
    - Sailor{
        - Equipment {
            - Melee Weapon {
                
            }
            - Ranged Weapon {
                
            }
            - Other {
                
            }
        }
        - Stat Order {
            
        }
        - Skills {
            
        }
        - Feats {
    
        }
        - Other {
            
        }
    }
    - Fisherman{
        - Equipment {
            - Melee Weapon {
                
            }
            - Ranged Weapon {
                
            }
            - Other {
                
            }
        }
        - Stat Order {
            
        }
        - Skills {
            
        }
        - Feats {
    
        }
        - Other {
            
        }
    }
    - Hunter{
        - Equipment {
            - Melee Weapon {
                
            }
            - Ranged Weapon {
                
            }
            - Other {
                
            }
        }
        - Stat Order {
            
        }
        - Skills {
            
        }
        - Feats {
    
        }
        - Other {
            
        }
    }
    - Trapper{
        - Equipment {
            - Melee Weapon {
                
            }
            - Ranged Weapon {
                
            }
            - Other {
                
            }
        }
        - Stat Order {
            
        }
        - Skills {
            
        }
        - Feats {
    
        }
        - Other {
            
        }
    }
    - Mason{
        - Equipment {
            - Melee Weapon {
                
            }
            - Ranged Weapon {
                
            }
            - Other {
                
            }
        }
        - Stat Order {
            
        }
        - Skills {
            
        }
        - Feats {
    
        }
        - Other {
            
        }
    }
}
- Spellcaster {
    - Combat {
        - Young Wizard {
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Military Wizard {
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Dark Wizard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Bandit Wizard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Mercenary Wizard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Spellsword {
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
    }
    - Non-Combat {
        - Loremaster Wizard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Hermit Wizard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Old Wizard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Mad Wizard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Court Wizard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
        - Hedge Wizard {
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
                
            }
            - Spells {
                - Level 0 {
                    
                }
                - Level 1 {
                    
                }
                - Level 2 {
                    
                }
                - Level 3 {
                    
                }
                - Level 4 {
                    
                }
                - Level 5 {
                    
                }
            }
        }
    }
}
- Warrior {
    - Soldier {
        - Recruit{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Veteran{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Young Knight{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Old Knight{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Light Cavalryman{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Heavy Cavalryman{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Scout{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Captain{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Archer{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Marine{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Guard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
    }
    - Bandit {
        - Pirate{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Buccaneer{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Bandit Archer{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Bandit Captain{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Bandit Fighter{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Bandit Cavalryman{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Assassin{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Brigand Ambusher{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
    }
    - Mercenary {
        - Mercenary Archer{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Mercenary Captain{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Mercenary Light Infantry{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Mercenary Heavy Infantry{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Mercenary Light Cavalryman{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Mercenary Heavy Cavalryman{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
    }
    - Other {
        - Bodyguard{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Gladiator{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Champion{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Brawler{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
        - Pit Fighter{
            - Equipment {
                    - Melee Weapon {
                        
                    }
                    - Ranged Weapon {
                        
                    }
                    - Other {
                        
                    }
                }
            - Stat Order {
                
            }
            - Skills {
                
            }
            - Feats {
        
            }
            - Other {
                
            }
        }
    }
}
}

