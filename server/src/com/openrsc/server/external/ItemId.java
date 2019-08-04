package com.openrsc.server.external;

import java.util.HashMap;
import java.util.Map;

public enum ItemId {
	NOTHING_REROLL(-3),
	NOTHING_INTEREST(-2),
	NOTHING(-1),
	IRON_MACE(0),
	IRON_SHORT_SWORD(1),
	IRON_KITE_SHIELD(2),
	IRON_SQUARE_SHIELD(3),
	WOODEN_SHIELD(4),
	MEDIUM_IRON_HELMET(5),
	LARGE_IRON_HELMET(6),
	IRON_CHAIN_MAIL_BODY(7),
	IRON_PLATE_MAIL_BODY(8),
	IRON_PLATE_MAIL_LEGS(9),
	COINS(10),
	BRONZE_ARROWS(11),
	IRON_AXE(12),
	KNIFE(13),
	LOGS(14),
	LEATHER_ARMOUR(15),
	LEATHER_GLOVES(16),
	BOOTS(17),
	CABBAGE(18),
	EGG(19),
	BONES(20),
	BUCKET(21),
	MILK(22),
	FLOUR(23),
	AMULET_OF_GHOSTSPEAK(24),
	SILVERLIGHT_KEY_1(25),
	SILVERLIGHT_KEY_2(26),
	QUEST_SKULL(27), // Quest item: The restless ghost
	IRON_DAGGER(28),
	GRAIN(29),
	BOOK(30),
	FIRE_RUNE(31),
	WATER_RUNE(32),
	AIR_RUNE(33),
	EARTH_RUNE(34),
	MIND_RUNE(35),
	BODY_RUNE(36),
	LIFE_RUNE(37),
	DEATH_RUNE(38),
	NEEDLE(39),
	NATURE_RUNE(40),
	CHAOS_RUNE(41),
	LAW_RUNE(42),
	THREAD(43),
	UNSTRUNG_HOLY_SYMBOL_OF_SARADOMIN(44),
	UNBLESSED_HOLY_SYMBOL(45),
	COSMIC_RUNE(46),
	PHOENIX_GANG_KEY(47),
	PHOENIX_GANG_WEAPON_KEY(48),
	SCROLL(49),
	BUCKET_OF_WATER(50),
	SILVERLIGHT_KEY_3(51),
	SILVERLIGHT(52),
	BROKEN_SHIELD_ARRAV_1(53),
	BROKEN_SHIELD_ARRAV_2(54),
	CADAVABERRIES(55),
	MESSAGE(56),
	CADAVA(57),
	POTION(58),
	PHOENIX_CROSSBOW(59),
	CROSSBOW(60),
	CERTIFICATE(61),
	BRONZE_DAGGER(62),
	STEEL_DAGGER(63),
	MITHRIL_DAGGER(64),
	ADAMANTITE_DAGGER(65),
	BRONZE_SHORT_SWORD(66),
	STEEL_SHORT_SWORD(67),
	MITHRIL_SHORT_SWORD(68),
	ADAMANTITE_SHORT_SWORD(69),
	BRONZE_LONG_SWORD(70),
	IRON_LONG_SWORD(71),
	STEEL_LONG_SWORD(72),
	MITHRIL_LONG_SWORD(73),
	ADAMANTITE_LONG_SWORD(74),
	RUNE_LONG_SWORD(75),
	BRONZE_2_HANDED_SWORD(76),
	IRON_2_HANDED_SWORD(77),
	STEEL_2_HANDED_SWORD(78),
	MITHRIL_2_HANDED_SWORD(79),
	ADAMANTITE_2_HANDED_SWORD(80),
	RUNE_2_HANDED_SWORD(81),
	BRONZE_SCIMITAR(82),
	IRON_SCIMITAR(83),
	STEEL_SCIMITAR(84),
	MITHRIL_SCIMITAR(85),
	ADAMANTITE_SCIMITAR(86),
	BRONZE_AXE(87),
	STEEL_AXE(88),
	IRON_BATTLE_AXE(89),
	STEEL_BATTLE_AXE(90),
	MITHRIL_BATTLE_AXE(91),
	ADAMANTITE_BATTLE_AXE(92),
	RUNE_BATTLE_AXE(93),
	BRONZE_MACE(94),
	STEEL_MACE(95),
	MITHRIL_MACE(96),
	ADAMANTITE_MACE(97),
	RUNE_MACE(98),
	BRASS_KEY(99),
	STAFF(100),
	STAFF_OF_AIR(101),
	STAFF_OF_WATER(102),
	STAFF_OF_EARTH(103),
	MEDIUM_BRONZE_HELMET(104),
	MEDIUM_STEEL_HELMET(105),
	MEDIUM_MITHRIL_HELMET(106),
	MEDIUM_ADAMANTITE_HELMET(107),
	LARGE_BRONZE_HELMET(108),
	LARGE_STEEL_HELMET(109),
	LARGE_MITHRIL_HELMET(110),
	LARGE_ADAMANTITE_HELMET(111),
	LARGE_RUNE_HELMET(112),
	BRONZE_CHAIN_MAIL_BODY(113),
	STEEL_CHAIN_MAIL_BODY(114),
	MITHRIL_CHAIN_MAIL_BODY(115),
	ADAMANTITE_CHAIN_MAIL_BODY(116),
	BRONZE_PLATE_MAIL_BODY(117),
	STEEL_PLATE_MAIL_BODY(118),
	MITHRIL_PLATE_MAIL_BODY(119),
	ADAMANTITE_PLATE_MAIL_BODY(120),
	STEEL_PLATE_MAIL_LEGS(121),
	MITHRIL_PLATE_MAIL_LEGS(122),
	ADAMANTITE_PLATE_MAIL_LEGS(123),
	BRONZE_SQUARE_SHIELD(124),
	STEEL_SQUARE_SHIELD(125),
	MITHRIL_SQUARE_SHIELD(126),
	ADAMANTITE_SQUARE_SHIELD(127),
	BRONZE_KITE_SHIELD(128),
	STEEL_KITE_SHIELD(129),
	MITHRIL_KITE_SHIELD(130),
	ADAMANTITE_KITE_SHIELD(131),
	COOKEDMEAT(132),
	RAW_CHICKEN(133),
	BURNTMEAT(134),
	POT(135),
	POT_OF_FLOUR(136),
	BREAD_DOUGH(137),
	BREAD(138),
	BURNTBREAD(139),
	JUG(140),
	JUG_OF_WATER(141),
	WINE(142),
	GRAPES(143),
	SHEARS(144),
	WOOL(145),
	FUR(146),
	COW_HIDE(147),
	LEATHER(148),
	CLAY(149),
	COPPER_ORE(150),
	IRON_ORE(151),
	GOLD(152), // from smelting
	MITHRIL_ORE(153),
	ADAMANTITE_ORE(154),
	COAL(155),
	BRONZE_PICKAXE(156),
	UNCUT_DIAMOND(157),
	UNCUT_RUBY(158),
	UNCUT_EMERALD(159),
	UNCUT_SAPPHIRE(160),
	DIAMOND(161),
	RUBY(162),
	EMERALD(163),
	SAPPHIRE(164),
	UNIDENTIFIED_GUAM_LEAF(165),
	TINDERBOX(166),
	CHISEL(167),
	HAMMER(168),
	BRONZE_BAR(169),
	IRON_BAR(170),
	STEEL_BAR(171),
	GOLD_BAR(172),
	MITHRIL_BAR(173),
	ADAMANTITE_BAR(174),
	PRESSURE_GAUGE(175),
	FISH_FOOD(176),
	POISON(177),
	POISONED_FISH_FOOD(178),
	SPINACH_ROLL(179),
	BAD_WINE(180),
	ASHES(181),
	WHITE_APRON(182),
	RED_CAPE(183),
	WIZARDS_ROBE(184),
	BLUE_WIZARDSHAT(185),
	BRASS_NECKLACE(186),
	BLUE_SKIRT(187),
	LONGBOW(188),
	SHORTBOW(189),
	CROSSBOW_BOLTS(190),
	BROWN_APRON(191),
	CHEFS_HAT(192),
	BEER(193),
	PINK_SKIRT(194),
	BLACK_SKIRT(195),
	BLACK_PLATE_MAIL_BODY(196),
	STAFF_OF_FIRE(197),
	MAGIC_STAFF(198),
	BLACK_WIZARDSHAT(199),
	SILK(200),
	FLIER(201),
	TIN_ORE(202),
	MITHRIL_AXE(203),
	ADAMANTITE_AXE(204),
	BRONZE_BATTLE_AXE(205),
	BRONZE_PLATE_MAIL_LEGS(206),
	BALL_OF_WOOL(207),
	OIL_CAN(208),
	BLACK_CAPE(209),
	KEBAB(210),
	SPADE(211),
	CLOSET_KEY(212),
	RUBBER_TUBE(213),
	BRONZE_PLATED_SKIRT(214),
	IRON_PLATED_SKIRT(215),
	BLACK_ROBE(216),
	STAKE(217),
	GARLIC(218),
	RED_SPIDERS_EGGS(219),
	LIMPWURT_ROOT(220),
	FULL_STRENGTH_POTION(221),
	THREE_STRENGTH_POTION(222),
	TWO_STRENGTH_POTION(223),
	ONE_STRENGTH_POTION(224),
	STEEL_PLATED_SKIRT(225),
	MITHRIL_PLATED_SKIRT(226),
	ADAMANTITE_PLATED_SKIRT(227),
	SPECIAL_DEFENSE_CABBAGE(228),
	BLUE_CAPE(229),
	LARGE_BLACK_HELMET(230),
	RED_BEAD(231),
	YELLOW_BEAD(232),
	BLACK_BEAD(233),
	WHITE_BEAD(234),
	AMULET_OF_ACCURACY(235),
	REDBERRIES(236),
	ROPE(237),
	REDDYE(238),
	YELLOWDYE(239),
	PASTE(240),
	ONION(241),
	BRONZE_KEY(242),
	SOFT_CLAY(243),
	BLONDE_WIG(244),
	WOOL_WIG(245),
	HALF_FULL_WINE_JUG(246),
	KEYPRINT(247),
	BLACK_PLATE_MAIL_LEGS(248),
	BANANA(249),
	PASTRY_DOUGH(250),
	PIE_DISH(251),
	COOKING_APPLE(252),
	PIE_SHELL(253),
	UNCOOKED_APPLE_PIE(254),
	UNCOOKED_MEAT_PIE(255),
	UNCOOKED_REDBERRY_PIE(256),
	APPLE_PIE(257),
	REDBERRY_PIE(258),
	MEAT_PIE(259),
	BURNTPIE(260),
	HALF_A_MEAT_PIE(261),
	HALF_A_REDBERRY_PIE(262),
	HALF_AN_APPLE_PIE(263),
	PORTRAIT(264),
	FALADIAN_KNIGHTS_SWORD(265),
	BLURITE_ORE(266),
	ASGARNIAN_ALE(267),
	WIZARDS_MIND_BOMB(268),
	DWARVEN_STOUT(269),
	EYE_OF_NEWT(270),
	RATS_TAIL(271),
	BLUEDYE(272),
	GOBLIN_ARMOUR(273),
	ORANGE_GOBLIN_ARMOUR(274),
	BLUE_GOBLIN_ARMOUR(275),
	UNSTRUNG_LONGBOW(276),
	UNSTRUNG_SHORTBOW(277),
	UNFIRED_PIE_DISH(278),
	UNFIRED_POT(279),
	ARROW_SHAFTS(280),
	WOAD_LEAF(281),
	ORANGEDYE(282),
	GOLD_RING(283),
	SAPPHIRE_RING(284),
	EMERALD_RING(285),
	RUBY_RING(286),
	DIAMOND_RING(287),
	GOLD_NECKLACE(288),
	SAPPHIRE_NECKLACE(289),
	EMERALD_NECKLACE(290),
	RUBY_NECKLACE(291),
	DIAMOND_NECKLACE(292),
	RING_MOULD(293),
	AMULET_MOULD(294),
	NECKLACE_MOULD(295),
	UNSTRUNG_GOLD_AMULET(296),
	UNSTRUNG_SAPPHIRE_AMULET(297),
	UNSTRUNG_EMERALD_AMULET(298),
	UNSTRUNG_RUBY_AMULET(299),
	UNSTRUNG_DIAMOND_AMULET(300),
	GOLD_AMULET(301),
	SAPPHIRE_AMULET(302),
	EMERALD_AMULET(303),
	RUBY_AMULET(304),
	DIAMOND_AMULET(305),
	SUPERCHISEL(306),
	MACE_OF_ZAMORAK(307),
	BRONZE_PLATE_MAIL_TOP(308),
	STEEL_PLATE_MAIL_TOP(309),
	MITHRIL_PLATE_MAIL_TOP(310),
	ADAMANTITE_PLATE_MAIL_TOP(311),
	IRON_PLATE_MAIL_TOP(312),
	BLACK_PLATE_MAIL_TOP(313),
	SAPPHIRE_AMULET_OF_MAGIC(314),
	EMERALD_AMULET_OF_PROTECTION(315),
	RUBY_AMULET_OF_STRENGTH(316),
	DIAMOND_AMULET_OF_POWER(317),
	KARAMJA_RUM(318),
	CHEESE(319),
	TOMATO(320),
	PIZZA_BASE(321),
	BURNT_PIZZA(322),
	INCOMPLETE_PIZZA(323),
	UNCOOKED_PIZZA(324),
	PLAIN_PIZZA(325),
	MEAT_PIZZA(326),
	ANCHOVIE_PIZZA(327),
	HALF_MEAT_PIZZA(328),
	HALF_ANCHOVIE_PIZZA(329),
	CAKE(330),
	BURNT_CAKE(331),
	CHOCOLATE_CAKE(332),
	PARTIAL_CAKE(333),
	PARTIAL_CHOCOLATE_CAKE(334),
	SLICE_OF_CAKE(335),
	CHOCOLATE_SLICE(336),
	CHOCOLATE_BAR(337),
	CAKE_TIN(338),
	UNCOOKED_CAKE(339),
	UNFIRED_BOWL(340),
	BOWL(341),
	BOWL_OF_WATER(342),
	INCOMPLETE_STEW_POTATO(343), // Needs Meat
	INCOMPLETE_STEW_MEAT(344), // Needs Potato
	UNCOOKED_STEW(345),
	STEW(346),
	BURNT_STEW(347),
	POTATO(348),
	RAW_SHRIMP(349),
	SHRIMP(350),
	RAW_ANCHOVIES(351),
	ANCHOVIES(352),
	BURNT_FISH(353),
	RAW_SARDINE(354),
	SARDINE(355),
	RAW_SALMON(356),
	SALMON(357),
	RAW_TROUT(358),
	TROUT(359),
	BURNT_TROUT(360),
	RAW_HERRING(361),
	HERRING(362),
	RAW_PIKE(363),
	PIKE(364),
	BURNT_PIKE(365),
	RAW_TUNA(366),
	TUNA(367),
	BURNT_TUNA(368),
	RAW_SWORDFISH(369),
	SWORDFISH(370),
	BURNT_SWORDFISH(371),
	RAW_LOBSTER(372),
	LOBSTER(373),
	BURNT_LOBSTER(374),
	LOBSTER_POT(375),
	NET(376),
	FISHING_ROD(377),
	FLY_FISHING_ROD(378),
	HARPOON(379),
	FISHING_BAIT(380),
	FEATHER(381),
	CHEST_KEY(382),
	SILVER(383),
	SILVER_BAR(384),
	HOLY_SYMBOL_OF_SARADOMIN(385),
	HOLY_SYMBOL_MOULD(386),
	DISK_OF_RETURNING(387),
	MONKS_ROBE_TOP(388),
	MONKS_ROBE_BOTTOM(389),
	RED_KEY(390),
	ORANGE_KEY(391),
	YELLOW_KEY(392),
	BLUE_KEY(393),
	MAGENTA_KEY(394),
	BLACK_KEY(395),
	RUNE_DAGGER(396),
	RUNE_SHORT_SWORD(397),
	RUNE_SCIMITAR(398),
	MEDIUM_RUNE_HELMET(399),
	RUNE_CHAIN_MAIL_BODY(400),
	RUNE_PLATE_MAIL_BODY(401),
	RUNE_PLATE_MAIL_LEGS(402),
	RUNE_SQUARE_SHIELD(403),
	RUNE_KITE_SHIELD(404),
	RUNE_AXE(405),
	RUNE_SKIRT(406),
	RUNE_PLATE_MAIL_TOP(407),
	RUNITE_BAR(408),
	RUNITE_ORE(409),
	PLANK(410),
	TILE(411),
	SKULL(412),
	BIG_BONES(413),
	MUDDY_KEY(414),
	MAP(415),
	MAP_PIECE_1(416),
	MAP_PIECE_2(417),
	MAP_PIECE_3(418),
	NAILS(419),
	ANTI_DRAGON_BREATH_SHIELD(420),
	MAZE_KEY(421),
	PUMPKIN(422),
	BLACK_DAGGER(423),
	BLACK_SHORT_SWORD(424),
	BLACK_LONG_SWORD(425),
	BLACK_2_HANDED_SWORD(426),
	BLACK_SCIMITAR(427),
	BLACK_AXE(428),
	BLACK_BATTLE_AXE(429),
	BLACK_MACE(430),
	BLACK_CHAIN_MAIL_BODY(431),
	BLACK_SQUARE_SHIELD(432),
	BLACK_KITE_SHIELD(433),
	BLACK_PLATED_SKIRT(434),
	UNIDENTIFIED_MARRENTILL(435),
	UNIDENTIFIED_TARROMIN(436),
	UNIDENTIFIED_HARRALANDER(437),
	UNIDENTIFIED_RANARR_WEED(438),
	UNIDENTIFIED_IRIT_LEAF(439),
	UNIDENTIFIED_AVANTOE(440),
	UNIDENTIFIED_KWUARM(441),
	UNIDENTIFIED_CADANTINE(442),
	UNIDENTIFIED_DWARF_WEED(443),
	GUAM_LEAF(444),
	MARRENTILL(445),
	TARROMIN(446),
	HARRALANDER(447),
	RANARR_WEED(448),
	IRIT_LEAF(449),
	AVANTOE(450),
	KWUARM(451),
	CADANTINE(452),
	DWARF_WEED(453),
	UNFINISHED_GUAM_POTION(454),
	UNFINISHED_MARRENTILL_POTION(455),
	UNFINISHED_TARROMIN_POTION(456),
	UNFINISHED_HARRALANDER_POTION(457),
	UNFINISHED_RANARR_POTION(458),
	UNFINISHED_IRIT_POTION(459),
	UNFINISHED_AVANTOE_POTION(460),
	UNFINISHED_KWUARM_POTION(461),
	UNFINISHED_CADANTINE_POTION(462),
	UNFINISHED_DWARFWEED_POTION(463),
	VIAL(464),
	EMPTY_VIAL(465),
	UNICORN_HORN(466),
	BLUE_DRAGON_SCALE(467),
	PESTLE_AND_MORTAR(468),
	SNAPE_GRASS(469),
	MEDIUM_BLACK_HELMET(470),
	WHITE_BERRIES(471),
	GROUND_BLUE_DRAGON_SCALE(472),
	GROUND_UNICORN_HORN(473),
	FULL_ATTACK_POTION(474),
	TWO_ATTACK_POTION(475),
	ONE_ATTACK_POTION(476),
	FULL_STAT_RESTORATION_POTION(477),
	TWO_STAT_RESTORATION_POTION(478),
	ONE_STAT_RESTORATION_POTION(479),
	FULL_DEFENSE_POTION(480),
	TWO_DEFENSE_POTION(481),
	ONE_DEFENSE_POTION(482),
	FULL_RESTORE_PRAYER_POTION(483),
	TWO_RESTORE_PRAYER_POTION(484),
	ONE_RESTORE_PRAYER_POTION(485),
	FULL_SUPER_ATTACK_POTION(486),
	TWO_SUPER_ATTACK_POTION(487),
	ONE_SUPER_ATTACK_POTION(488),
	FULL_FISHING_POTION(489),
	TWO_FISHING_POTION(490),
	ONE_FISHING_POTION(491),
	FULL_SUPER_STRENGTH_POTION(492),
	TWO_SUPER_STRENGTH_POTION(493),
	ONE_SUPER_STRENGTH_POTION(494),
	FULL_SUPER_DEFENSE_POTION(495),
	TWO_SUPER_DEFENSE_POTION(496),
	ONE_SUPER_DEFENSE_POTION(497),
	FULL_RANGING_POTION(498),
	TWO_RANGING_POTION(499),
	ONE_RANGING_POTION(500),
	WINE_OF_ZAMORAK(501),
	RAW_BEAR_MEAT(502),
	RAW_RAT_MEAT(503),
	RAW_BEEF(504),
	ENCHANTED_BEAR_MEAT(505),
	ENCHANTED_RAT_MEAT(506),
	ENCHANTED_BEEF(507),
	ENCHANTED_CHICKEN_MEAT(508),
	DRAMEN_STAFF(509),
	DRAMEN_BRANCH(510),
	GREEN_CAPE(511),
	YELLOW_CAPE(512),
	ORANGE_CAPE(513),
	PURPLE_CAPE(514),
	GREENDYE(515),
	PURPLEDYE(516),
	IRON_ORE_CERTIFICATE(517),
	COAL_CERTIFICATE(518),
	MITHRIL_ORE_CERTIFICATE(519),
	SILVER_CERTIFICATE(520),
	GOLD_CERTIFICATE(521),
	DRAGONSTONE_AMULET(522),
	DRAGONSTONE(523),
	UNSTRUNG_DRAGONSTONE_AMULET(524),
	CRYSTAL_KEY(525),
	TOOTH_KEY_HALF(526),
	LOOP_KEY_HALF(527),
	IRON_BAR_CERTIFICATE(528),
	STEEL_BAR_CERTIFICATE(529),
	MITHRIL_BAR_CERTIFICATE(530),
	SILVER_BAR_CERTIFICATE(531),
	GOLD_BAR_CERTIFICATE(532),
	LOBSTER_CERTIFICATE(533),
	RAW_LOBSTER_CERTIFICATE(534),
	SWORDFISH_CERTIFICATE(535),
	RAW_SWORDFISH_CERTIFICATE(536),
	DIARY(537),
	FRONT_DOOR_KEY(538),
	BALL(539),
	MAGNET(540),
	GREY_WOLF_FUR(541),
	UNCUT_DRAGONSTONE(542),
	DRAGONSTONE_RING(543),
	DRAGONSTONE_NECKLACE(544),
	RAW_SHARK(545),
	SHARK(546),
	BURNT_SHARK(547),
	BIG_NET(548),
	CASKET(549),
	RAW_COD(550),
	COD(551),
	RAW_MACKEREL(552),
	MACKEREL(553),
	RAW_BASS(554),
	BASS(555),
	ICE_GLOVES(556),
	RED_FIREBIRD_FEATHER(557),
	YELLOW_FIREBIRD_FEATHER(558),
	POISONED_IRON_DAGGER(559),
	POISONED_BRONZE_DAGGER(560),
	POISONED_STEEL_DAGGER(561),
	POISONED_MITHRIL_DAGGER(562),
	POISONED_RUNE_DAGGER(563),
	POISONED_ADAMANTITE_DAGGER(564),
	POISONED_BLACK_DAGGER(565),
	FULL_CURE_POISON_POTION(566),
	TWO_CURE_POISON_POTION(567),
	ONE_CURE_POISON_POTION(568),
	FULL_POISON_ANTIDOTE(569),
	TWO_POISON_ANTIDOTE(570),
	ONE_POISON_ANTIDOTE(571),
	WEAPON_POISON(572),
	ID_PAPER(573),
	POISON_BRONZE_ARROWS(574),
	CHRISTMAS_CRACKER(575),
	RED_PARTY_HAT(576),
	YELLOW_PARTY_HAT(577),
	BLUE_PARTY_HAT(578),
	GREEN_PARTY_HAT(579),
	PINK_PARTY_HAT(580),
	WHITE_PARTY_HAT(581),
	MISCELLANEOUS_KEY(582),
	BUNCH_OF_KEYS(583),
	DRAYNOR_WHISKY(584),
	CANDLESTICK(585),
	MASTER_THIEF_ARMBAND(586),
	BLAMISH_SNAIL_SLIME(587),
	BLAMISH_OIL(588),
	OILY_FISHING_ROD(589),
	LAVA_EEL(590),
	RAW_LAVA_EEL(591),
	POISON_CROSSBOW_BOLTS(592),
	DRAGON_SWORD(593),
	DRAGON_AXE(594),
	JAIL_KEYS(595),
	DUSTY_KEY(596),
	CHARGED_DRAGONSTONE_AMULET(597),
	GROG(598),
	UNLIT_CANDLE(599),
	UNLIT_BLACK_CANDLE(600),
	LIT_CANDLE(601),
	LIT_BLACK_CANDLE(602),
	INSECT_REPELLANT(603),
	BAT_BONES(604),
	WAX_BUCKET(605),
	EXCALIBUR(606),
	DRUIDS_ROBE_TOP(607),
	DRUIDS_ROBE_BOTTOM(608),
	EYE_PATCH(609),
	UNENCHANTED_DRAGONSTONE_AMULET(610),
	UNPOWERED_ORB(611),
	FIRE_ORB(612),
	WATER_ORB(613),
	BATTLESTAFF(614),
	BATTLESTAFF_OF_FIRE(615),
	BATTLESTAFF_OF_WATER(616),
	BATTLESTAFF_OF_AIR(617),
	BATTLESTAFF_OF_EARTH(618),
	BLOOD_RUNE(619),
	BEER_GLASS(620),
	GLASSBLOWING_PIPE(621),
	SEAWEED(622),
	MOLTEN_GLASS(623),
	SODA_ASH(624),
	SAND(625),
	AIR_ORB(626),
	EARTH_ORB(627),
	BASS_CERTIFICATE(628),
	RAW_BASS_CERTIFICATE(629),
	SHARK_CERTIFICATE(630),
	RAW_SHARK_CERTIFICATE(631),
	OAK_LOGS(632),
	WILLOW_LOGS(633),
	MAPLE_LOGS(634),
	YEW_LOGS(635),
	MAGIC_LOGS(636),
	HEADLESS_ARROWS(637),
	IRON_ARROWS(638),
	POISON_IRON_ARROWS(639),
	STEEL_ARROWS(640),
	POISON_STEEL_ARROWS(641),
	MITHRIL_ARROWS(642),
	POISON_MITHRIL_ARROWS(643),
	ADAMANTITE_ARROWS(644),
	POISON_ADAMANTITE_ARROWS(645),
	RUNE_ARROWS(646),
	POISON_RUNE_ARROWS(647),
	OAK_LONGBOW(648),
	OAK_SHORTBOW(649),
	WILLOW_LONGBOW(650),
	WILLOW_SHORTBOW(651),
	MAPLE_LONGBOW(652),
	MAPLE_SHORTBOW(653),
	YEW_LONGBOW(654),
	YEW_SHORTBOW(655),
	MAGIC_LONGBOW(656),
	MAGIC_SHORTBOW(657),
	UNSTRUNG_OAK_LONGBOW(658),
	UNSTRUNG_OAK_SHORTBOW(659),
	UNSTRUNG_WILLOW_LONGBOW(660),
	UNSTRUNG_WILLOW_SHORTBOW(661),
	UNSTRUNG_MAPLE_LONGBOW(662),
	UNSTRUNG_MAPLE_SHORTBOW(663),
	UNSTRUNG_YEW_LONGBOW(664),
	UNSTRUNG_YEW_SHORTBOW(665),
	UNSTRUNG_MAGIC_LONGBOW(666),
	UNSTRUNG_MAGIC_SHORTBOW(667),
	BARCRAWL_CARD(668),
	BRONZE_ARROW_HEADS(669),
	IRON_ARROW_HEADS(670),
	STEEL_ARROW_HEADS(671),
	MITHRIL_ARROW_HEADS(672),
	ADAMANTITE_ARROW_HEADS(673),
	RUNE_ARROW_HEADS(674),
	FLAX(675),
	BOW_STRING(676),
	EASTER_EGG(677),
	SCORPION_CAGE_NONE(678),
	SCORPION_CAGE_ONE(679),
	SCORPION_CAGE_ONE_TWO(680),
	SCORPION_CAGE_ONE_TWO_THREE(681),
	ENCHANTED_BATTLESTAFF_OF_FIRE(682),
	ENCHANTED_BATTLESTAFF_OF_WATER(683),
	ENCHANTED_BATTLESTAFF_OF_AIR(684),
	ENCHANTED_BATTLESTAFF_OF_EARTH(685),
	SCORPION_CAGE_TWO(686),
	SCORPION_CAGE_THREE(687),
	SCORPION_CAGE_ONE_THREE(688),
	SCORPION_CAGE_TWO_THREE(689),
	GOLD_FAMILYCREST(690), // Quest Item
	GOLD_BAR_FAMILYCREST(691), // Quest Item
	RUBY_RING_FAMILYCREST(692), // Quest Item
	RUBY_NECKLACE_FAMILYCREST(693), // Quest Item
	FAMILY_CREST(694), // Quest Item
	CREST_FRAGMENT_ONE(695), // Quest Item
	CREST_FRAGMENT_TWO(696), // Quest Item
	CREST_FRAGMENT_THREE(697), // Quest Item
	STEEL_GAUNTLETS(698),
	GAUNTLETS_OF_GOLDSMITHING(699),
	GAUNTLETS_OF_COOKING(700),
	GAUNTLETS_OF_CHAOS(701),
	ROBE_OF_ZAMORAK_TOP(702),
	ROBE_OF_ZAMORAK_BOTTOM(703),
	ADDRESS_LABEL(704),
	TRIBAL_TOTEM(705),
	TOURIST_GUIDE(706),
	SPICE(707),
	UNCOOKED_CURRY(708),
	CURRY(709),
	BURNT_CURRY(710),
	YEW_LOGS_CERTIFICATE(711),
	MAPLE_LOGS_CERTIFICATE(712),
	WILLOW_LOGS_CERTIFICATE(713),
	LOCKPICK(714),
	RED_VINE_WORMS(715),
	BLANKET(716),
	RAW_GIANT_CARP(717),
	GIANT_CARP(718),
	FISHING_COMPETITION_PASS(719),
	HEMENSTER_FISHING_TROPHY(720),
	PENDANT_OF_LUCIEN(721),
	BOOTS_OF_LIGHTFOOTEDNESS(722),
	ICE_ARROWS(723),
	LEVER(724),
	STAFF_OF_ARMADYL(725),
	PENDANT_OF_ARMADYL(726),
	LARGE_COG_BLUE(727), // Quest Item
	LARGE_COG_BLACK(728), // Quest Item
	LARGE_COG_RED(729), // Quest Item
	LARGE_COG_PURPLE(730), // Quest Item
	RAT_POISON(731),
	SHINY_KEY(732),
	KHAZARD_HELMET(733),
	KHAZARD_CHAINMAIL(734),
	KHALI_BREW(735),
	KHAZARD_CELL_KEYS(736),
	POISON_CHALICE(737),
	MAGIC_WHISTLE(738),
	CUP_OF_TEA(739),
	ORB_OF_PROTECTION(740),
	ORBS_OF_PROTECTION(741),
	HOLY_TABLE_NAPKIN(742),
	BELL(743),
	GNOME_EMERALD_AMULET_OF_PROTECTION(744),
	MAGIC_GOLDEN_FEATHER(745),
	HOLY_GRAIL(746),
	SCRIPT_OF_HAZEEL(747),
	PINEAPPLE(748),
	PINEAPPLE_RING(749),
	PINEAPPLE_PIZZA(750),
	HALF_PINEAPPLE_PIZZA(751),
	MAGIC_SCROLL(752),
	MARK_OF_HAZEEL(753),
	BLOODY_AXE_OF_ZAMORAK(754),
	CARNILLEAN_ARMOUR(755),
	CARNILLEAN_KEY(756),
	CATTLE_PROD(757),
	PLAGUED_SHEEP_REMAINS_1(758),
	POISONED_ANIMAL_FEED(759),
	PROTECTIVE_JACKET(760),
	PROTECTIVE_TROUSERS(761),
	PLAGUED_SHEEP_REMAINS_2(762),
	PLAGUED_SHEEP_REMAINS_3(763),
	PLAGUED_SHEEP_REMAINS_4(764),
	DWELLBERRIES(765),
	GASMASK(766),
	PICTURE(767),
	PLAGUE_CITY_BOOK(768), // Quest Item
	SEASLUG(769),
	CHOCOLATY_MILK(770),
	HANGOVER_CURE(771),
	CHOCOLATE_DUST(772),
	UNLIT_TORCH(773),
	LIT_TORCH(774),
	WARRANT(775),
	DAMP_STICKS(776),
	DRY_STICKS(777),
	BROKEN_GLASS(778),
	QUEST_OYSTER_PEARLS(779),
	LITTLE_KEY(780),
	SCRUFFY_NOTE(781),
	GLARIALS_AMULET(782),
	SWAMP_TAR(783),
	UNCOOKED_SWAMP_PASTE(784),
	SWAMP_PASTE(785),
	OYSTER_PEARL_BOLTS(786),
	GLARIALS_PEBBLE(787),
	BOOK_ON_BAXTORIAN(788),
	LARGE_KEY(789),
	OYSTER_PEARL_BOLT_TIPS(790),
	EMPTY_OYSTER(791),
	OYSTER_PEARLS(792),
	OYSTER(793),
	SOIL(794),
	DRAGON_MEDIUM_HELMET(795),
	MITHRIL_SEED(796),
	AN_OLD_KEY(797),
	PIGEON_CAGE(798),
	MESSENGER_PIGEONS(799),
	BIRD_FEED(800),
	ROTTEN_APPLES(801),
	DOCTORS_GOWN(802),
	BIOHAZARD_BRONZE_KEY(803), // Quest Item
	DISTILLATOR(804),
	GLARIALS_URN(805),
	GLARIALS_URN_EMPTY(806),
	PRIEST_ROBE(807),
	PRIEST_GOWN(808),
	LIQUID_HONEY(809),
	ETHENEA(810),
	SULPHURIC_BROLINE(811),
	PLAGUE_SAMPLE(812),
	TOUCH_PAPER(813),
	DRAGON_BONES(814),
	UNIDENTIFIED_SNAKE_WEED(815),
	SNAKE_WEED(816),
	UNIDENTIFIED_ARDRIGAL(817),
	ARDRIGAL(818),
	UNIDENTIFIED_SITO_FOIL(819),
	SITO_FOIL(820),
	UNIDENTIFIED_VOLENCIA_MOSS(821),
	VOLENCIA_MOSS(822),
	UNIDENTIFIED_ROGUES_PURSE(823),
	ROGUES_PURSE(824),
	SOUL_RUNE(825),
	KING_LATHAS_AMULET(826),
	BRONZE_SPEAR(827),
	GREEN_HALLOWEEN_MASK(828),
	DRAGON_BITTER(829),
	GREENMANS_ALE(830),
	RED_HALLOWEEN_MASK(831),
	BLUE_HALLOWEEN_MASK(832),
	COCKTAIL_GLASS(833),
	COCKTAIL_SHAKER(834),
	BONE_KEY(835),
	GNOME_ROBE_PINK(836),
	GNOME_ROBE_GREEN(837),
	GNOME_ROBE_PURPLE(838),
	GNOME_ROBE_CREAM(839),
	GNOME_ROBE_BLUE(840),
	GNOMESHAT_PINK(841),
	GNOMESHAT_GREEN(842),
	GNOMESHAT_PURPLE(843),
	GNOMESHAT_CREAM(844),
	GNOMESHAT_BLUE(845),
	GNOME_TOP_PINK(846),
	GNOME_TOP_GREEN(847),
	GNOME_TOP_PURPLE(848),
	GNOME_TOP_CREAM(849),
	GNOME_TOP_BLUE(850),
	GNOME_COCKTAIL_GUIDE(851),
	BEADS_OF_THE_DEAD(852),
	HALF_COCKTAIL_GLASS(853),
	FULL_COCKTAIL_GLASS(854),
	LEMON(855),
	LEMON_SLICES(856),
	ORANGE(857),
	ORANGE_SLICES(858),
	DICED_ORANGE(859),
	DICED_LEMON(860),
	FRESH_PINEAPPLE(861),
	PINEAPPLE_CHUNKS(862),
	LIME(863),
	LIME_CHUNKS(864),
	LIME_SLICES(865),
	FRUIT_BLAST(866),
	ODD_LOOKING_COCKTAIL(867),
	WHISKY(868),
	VODKA(869),
	GIN(870),
	CREAM(871),
	DRUNK_DRAGON(872),
	EQUA_LEAVES(873),
	SGG(874),
	CHOCOLATE_SATURDAY(875),
	BRANDY(876),
	BLURBERRY_SPECIAL(877),
	WIZARD_BLIZZARD(878),
	PINEAPPLE_PUNCH(879),
	GNOMEBATTA_DOUGH(880),
	GIANNE_DOUGH(881),
	GNOMEBOWL_DOUGH(882),
	GNOMECRUNCHIE_DOUGH(883),
	GNOMEBATTA(884),
	GNOMEBOWL(885),
	BURNT_GNOMEBATTA(886),
	BURNT_GNOMECRUNCHIE(887),
	BURNT_GNOMEBOWL(888),
	UNCUT_RED_TOPAZ(889),
	UNCUT_JADE(890),
	UNCUT_OPAL(891),
	RED_TOPAZ(892),
	JADE(893),
	OPAL(894),
	SWAMP_TOAD(895),
	TOAD_LEGS(896),
	KING_WORM(897),
	GNOME_SPICE(898),
	GIANNE_COOK_BOOK(899),
	GNOMECRUNCHIE(900),
	CHEESE_AND_TOMATO_BATTA(901),
	TOAD_BATTA(902),
	GNOME_BATTA(903),
	WORM_BATTA(904),
	FRUIT_BATTA(905),
	VEG_BATTA(906),
	CHOCOLATE_BOMB(907),
	VEGBALL(908),
	WORM_HOLE(909),
	TANGLED_TOADS_LEGS(910),
	CHOC_CRUNCHIES(911),
	WORM_CRUNCHIES(912),
	TOAD_CRUNCHIES(913),
	SPICE_CRUNCHIES(914),
	CRUSHED_GEMSTONE(915),
	BLURBERRY_BADGE(916),
	GIANNE_BADGE(917),
	TREE_GNOME_TRANSLATION(918),
	BARK_SAMPLE(919),
	WAR_SHIP(920),
	GLOUGHS_JOURNAL(921),
	INVOICE(922),
	UGTHANKI_KEBAB(923),
	SPECIAL_CURRY(924),
	GLOUGHS_KEY(925),
	GLOUGHS_NOTES(926),
	PEBBLE_1(927),
	PEBBLE_2(928),
	PEBBLE_3(929),
	PEBBLE_4(930),
	DACONIA_ROCK(931),
	SINISTER_KEY(932),
	UNIDENTIFIED_TORSTOL(933),
	TORSTOL(934),
	UNFINISHED_TORSTROL_POTION(935),
	JANGERBERRIES(936),
	BLURBERRY_BARMAN_FRUIT_BLAST(937),
	BLURBERRY_BARMAN_BLURBERRY_SPECIAL(938),
	BLURBERRY_BARMAN_WIZARD_BLIZZARD(939),
	BLURBERRY_BARMAN_PINEAPPLE_PUNCH(940),
	BLURBERRY_BARMAN_SGG(941),
	BLURBERRY_BARMAN_CHOCOLATE_SATURDAY(942),
	BLURBERRY_BARMAN_DRUNK_DRAGON(943),
	GNOME_WAITER_CHEESE_AND_TOMATO_BATTA(944),
	GNOME_WAITER_TOAD_BATTA(945),
	//	GNOME_BATTA(946), // Appears to be unused.
	GNOME_WAITER_WORM_BATTA(947),
	GNOME_WAITER_FRUIT_BATTA(948),
	GNOME_WAITER_VEG_BATTA(949),
	GNOME_WAITER_CHOCOLATE_BOMB(950),
	GNOME_WAITER_VEGBALL(951),
	GNOME_WAITER_WORM_HOLE(952),
	GNOME_WAITER_TANGLED_TOADS_LEGS(953),
	GNOME_WAITER_CHOC_CRUNCHIES(954),
	GNOME_WAITER_WORM_CRUNCHIES(955),
	GNOME_WAITER_TOAD_CRUNCHIES(956),
	GNOME_WAITER_SPICE_CRUNCHIES(957),
	STONE_PLAQUE(958),
	TATTERED_SCROLL(959),
	CRUMPLED_SCROLL(960),
	BERVIRIUS_TOMB_NOTES(961),
	ZADIMUS_CORPSE(962),
	FULL_POTION_OF_ZAMORAK(963),
	TWO_POTION_OF_ZAMORAK(964),
	ONE_POTION_OF_ZAMORAK(965),
	BOOTS_PINK(966),
	BOOTS_GREEN(967),
	BOOTS_PURPLE(968),
	BOOTS_CREAM(969),
	BOOTS_BLUE(970),
	SANTAS_HAT(971),
	LOCATING_CRYSTAL(972),
	SWORD_POMMEL(973),
	BONE_SHARD(974),
	STEEL_WIRE(975),
	BONE_BEADS(976),
	RASHILIYA_CORPSE(977),
	RESETCRYSTAL(978),
	BRONZE_WIRE(979),
	PRESENT(980),
	GNOME_BALL(981),
	PAPYRUS(982),
	A_LUMP_OF_CHARCOAL(983),
	ARROW(984),
	LIT_ARROW(985),
	ROCKS(986),
	PARAMAYA_REST_TICKET(987),
	SHIP_TICKET(988),
	DAMP_CLOTH(989),
	DESERT_BOOTS(990),
	ORB_OF_LIGHT_WHITE(991),
	ORB_OF_LIGHT_BLUE(992),
	ORB_OF_LIGHT_PINK(993),
	ORB_OF_LIGHT_YELLOW(994),
	RAILING(995),
	RANDASS_JOURNAL(996),
	UNDERGROUND_PASS_UNICORN_HORN(997), // Quest Item
	COAT_OF_ARMS_RED(998),
	COAT_OF_ARMS_BLUE(999),
	STAFF_OF_IBAN(1000),
	DWARF_BREW(1001),
	IBANS_ASHES(1002),
	KARDIA_CAT(1003),
	A_DOLL_OF_IBAN(1004),
	OLD_JOURNAL(1005),
	KLANKS_GAUNTLETS(1006),
	IBANS_SHADOW(1007),
	IBANS_CONSCIENCE(1008),
	AMULET_OF_OTHAINIAN(1009),
	AMULET_OF_DOOMION(1010),
	AMULET_OF_HOLTHION(1011),
	KEEP_KEY(1012),
	BRONZE_THROWING_DART(1013),
	PROTOTYPE_THROWING_DART(1014),
	IRON_THROWING_DART(1015),
	FULL_WATER_SKIN(1016),
	LENS_MOULD(1017),
	LENS(1018),
	DESERT_ROBE(1019),
	DESERT_SHIRT(1020),
	METAL_KEY(1021),
	SLAVES_ROBE_BOTTOM(1022),
	SLAVES_ROBE_TOP(1023),
	STEEL_THROWING_DART(1024),
	ASTROLOGY_BOOK(1025),
	UNHOLY_SYMBOL_MOULD(1026),
	UNSTRUNG_UNHOLY_SYMBOL_OF_ZAMORAK(1027),
	UNBLESSED_UNHOLY_SYMBOL_OF_ZAMORAK(1028),
	UNHOLY_SYMBOL_OF_ZAMORAK(1029),
	SHANTAY_DESERT_PASS(1030),
	STAFF_OF_IBAN_BROKEN(1031),
	DWARF_CANNON_BASE(1032),
	DWARF_CANNON_STAND(1033),
	DWARF_CANNON_BARRELS(1034),
	DWARF_CANNON_FURNACE(1035),
	FINGERNAILS(1036),
	POWERING_CRYSTAL1(1037),
	MINING_BARREL(1038),
	ANA_IN_A_BARREL(1039),
	STOLEN_GOLD(1040),
	MULTI_CANNON_BALL(1041),
	RAILING_DWARF_CANNON(1042),
	OGRE_TOOTH(1043),
	OGRE_RELIC(1044),
	SKAVID_MAP(1045),
	DWARF_REMAINS(1046),
	KEY(1047),
	OGRE_RELIC_PART_HEAD(1048),
	OGRE_RELIC_PART_BASE(1049),
	OGRE_RELIC_PART_BODY(1050),
	GROUND_BAT_BONES(1051),
	UNFINISHED_OGRE_POTION(1052),
	OGRE_POTION(1053),
	MAGIC_OGRE_POTION(1054),
	TOOL_KIT(1055),
	NULODIONS_NOTES(1056),
	CANNON_AMMO_MOULD(1057),
	TENTI_PINEAPPLE(1058),
	BEDOBIN_COPY_KEY(1059),
	TECHNICAL_PLANS(1060),
	ROCK_CAKE(1061),
	BRONZE_DART_TIPS(1062),
	IRON_DART_TIPS(1063),
	STEEL_DART_TIPS(1064),
	MITHRIL_DART_TIPS(1065),
	ADAMANTITE_DART_TIPS(1066),
	RUNE_DART_TIPS(1067),
	MITHRIL_THROWING_DART(1068),
	ADAMANTITE_THROWING_DART(1069),
	RUNE_THROWING_DART(1070),
	PROTOTYPE_DART_TIP(1071),
	INFO_DOCUMENT(1072),
	INSTRUCTION_MANUAL(1073),
	UNFINISHED_POTION(1074),
	IRON_THROWING_KNIFE(1075),
	BRONZE_THROWING_KNIFE(1076),
	STEEL_THROWING_KNIFE(1077),
	MITHRIL_THROWING_KNIFE(1078),
	ADAMANTITE_THROWING_KNIFE(1079),
	RUNE_THROWING_KNIFE(1080),
	BLACK_THROWING_KNIFE(1081),
	WATER_SKIN_MOSTLY_FULL(1082),
	WATER_SKIN_MOSTLY_EMPTY(1083),
	WATER_SKIN_MOUTHFUL_LEFT(1084),
	EMPTY_WATER_SKIN(1085),
	NIGHTSHADE(1086),
	SHAMAN_ROBE(1087),
	IRON_SPEAR(1088),
	STEEL_SPEAR(1089),
	MITHRIL_SPEAR(1090),
	ADAMANTITE_SPEAR(1091),
	RUNE_SPEAR(1092),
	GERTRUDES_CAT(1093), // FLUFFS
	SEASONED_SARDINE(1094),
	KITTENS(1095),
	KITTEN(1096),
	WROUGHT_IRON_KEY(1097),
	CELL_DOOR_KEY(1098),
	A_FREE_SHANTAY_DISCLAIMER(1099),
	DOOGLE_LEAVES(1100),
	RAW_UGTHANKI_MEAT(1101),
	TASTY_UGTHANKI_KEBAB(1102),
	COOKED_UGTHANKI_MEAT(1103),
	UNCOOKED_PITTA_BREAD(1104),
	PITTA_BREAD(1105),
	TOMATO_MIXTURE(1106),
	ONION_MIXTURE(1107),
	ONION_AND_TOMATO_MIXTURE(1108),
	ONION_AND_TOMATO_AND_UGTHANKI_MIX(1109),
	BURNT_PITTA_BREAD(1110),
	PANNING_TRAY(1111),
	PANNING_TRAY_GOLD_NUGGET(1112),
	PANNING_TRAY_FULL(1113),
	ROCK_PICK(1114),
	SPECIMEN_BRUSH(1115),
	SPECIMEN_JAR(1116),
	ROCK_SAMPLE_GREEN(1117),
	GOLD_NUGGETS(1118),
	CAT(1119),
	SCRUMPLED_PIECE_OF_PAPER(1120),
	DIGSITE_INFO(1121),
	POISONED_BRONZE_THROWING_DART(1122),
	POISONED_IRON_THROWING_DART(1123),
	POISONED_STEEL_THROWING_DART(1124),
	POISONED_MITHRIL_THROWING_DART(1125),
	POISONED_ADAMANTITE_THROWING_DART(1126),
	POISONED_RUNE_THROWING_DART(1127),
	POISONED_BRONZE_THROWING_KNIFE(1128),
	POISONED_IRON_THROWING_KNIFE(1129),
	POISONED_STEEL_THROWING_KNIFE(1130),
	POISONED_MITHRIL_THROWING_KNIFE(1131),
	POISONED_BLACK_THROWING_KNIFE(1132),
	POISONED_ADAMANTITE_THROWING_KNIFE(1133),
	POISONED_RUNE_THROWING_KNIFE(1134),
	POISONED_BRONZE_SPEAR(1135),
	POISONED_IRON_SPEAR(1136),
	POISONED_STEEL_SPEAR(1137),
	POISONED_MITHRIL_SPEAR(1138),
	POISONED_ADAMANTITE_SPEAR(1139),
	POISONED_RUNE_SPEAR(1140),
	BOOK_OF_EXPERIMENTAL_CHEMISTRY(1141),
	LEVEL_1_CERTIFICATE(1142),
	LEVEL_2_CERTIFICATE(1143),
	LEVEL_3_CERTIFICATE(1144),
	TROWEL(1145),
	STAMPED_LETTER_OF_RECOMMENDATION(1146),
	UNSTAMPED_LETTER_OF_RECOMMENDATION(1147),
	ROCK_SAMPLE_ORANGE(1148),
	ROCK_SAMPLE_PURPLE(1149),
	CRACKED_ROCK_SAMPLE(1150),
	BELT_BUCKLE(1151),
	POWERING_CRYSTAL2(1152),
	POWERING_CRYSTAL3(1153),
	POWERING_CRYSTAL4(1154),
	OLD_BOOT(1155),
	BUNNY_EARS(1156),
	DAMAGED_ARMOUR_1(1157),
	DAMAGED_ARMOUR_2(1158),
	RUSTY_SWORD(1159),
	AMMONIUM_NITRATE(1160),
	NITROGLYCERIN(1161),
	OLD_TOOTH(1162),
	RADIMUS_SCROLLS(1163),
	DIGSITE_CHEST_KEY(1164),
	BROKEN_ARROW(1165),
	BUTTONS(1166),
	BROKEN_STAFF(1167),
	VASE(1168),
	CERAMIC_REMAINS(1169),
	BROKEN_GLASS_DIGSITE_LVL_2(1170),
	UNIDENTIFIED_POWDER(1171),
	MACHETTE(1172),
	DIGSITE_SCROLL(1173),
	STONE_TABLET(1174),
	TALISMAN_OF_ZAROS(1175),
	EXPLOSIVE_COMPOUND(1176),
	BULL_ROARER(1177),
	MIXED_CHEMICALS_1(1178),
	GROUND_CHARCOAL(1179),
	MIXED_CHEMICALS_2(1180),
	SPELL_SCROLL(1181),
	YOMMI_TREE_SEED(1182),
	TOTEM_POLE(1183),
	// These appear to be unused
//	DWARF_CANNON_BASE(1184),
//	DWARF_CANNON_STAND(1185),
//	DWARF_CANNON_BARRELS(1186),
//	DWARF_CANNON_FURNACE(1187),
	GOLDEN_BOWL(1188),
	GOLDEN_BOWL_WITH_PURE_WATER(1189),
	RAW_MANTA_RAY(1190),
	MANTA_RAY(1191),
	RAW_SEA_TURTLE(1192),
	SEA_TURTLE(1193),
	ANNAS_SILVER_NECKLACE(1194),
	BOBS_SILVER_TEACUP(1195),
	CAROLS_SILVER_BOTTLE(1196),
	DAVIDS_SILVER_BOOK(1197),
	ELIZABETHS_SILVER_NEEDLE(1198),
	FRANKS_SILVER_POT(1199),
	THREAD_RED(1200), // Quest Item - Murder Mystery
	THREAD_GREEN(1201), // Quest Item - Murder Mystery
	THREAD_BLUE(1202), // Quest Item - Murder Mystery
	FLYPAPER(1203),
	MURDER_SCENE_POT(1204),
	A_SILVER_DAGGER(1205),
	MURDERERS_FINGERPRINT(1206),
	ANNAS_FINGERPRINT(1207),
	BOBS_FINGERPRINT(1208),
	CAROLS_FINGERPRINT(1209),
	DAVIDS_FINGERPRINT(1210),
	ELIZABETHS_FINGERPRINT(1211),
	FRANKS_FINGERPRINT(1212),
	ZAMORAK_CAPE(1213),
	SARADOMIN_CAPE(1214),
	GUTHIX_CAPE(1215),
	STAFF_OF_ZAMORAK(1216),
	STAFF_OF_GUTHIX(1217),
	STAFF_OF_SARADOMIN(1218),
	A_CHUNK_OF_CRYSTAL(1219),
	A_LUMP_OF_CRYSTAL(1220),
	A_HUNK_OF_CRYSTAL(1221),
	A_RED_CRYSTAL(1222),
	UNIDENTIFIED_FINGERPRINT(1223),
	ANNAS_SILVER_NECKLACE_FLOUR(1224),
	BOBS_SILVER_TEACUP_FLOUR(1225),
	CAROLS_SILVER_BOTTLE_FLOUR(1226),
	DAVIDS_SILVER_BOOK_FLOUR(1227),
	ELIZABETHS_SILVER_NEEDLE_FLOUR(1228),
	FRANKS_SILVER_POT_FLOUR(1229),
	A_SILVER_DAGGER_FLOUR(1230),
	A_GLOWING_RED_CRYSTAL(1231),
	UNIDENTIFIED_LIQUID(1232),
	RADIMUS_SCROLLS_COMPLETE(1233),
	ROBE(1234),
	ARMOUR(1235),
	DAGGER(1236),
	WATCH_TOWER_EYE_PATCH(1237),
	BOOKING_OF_BINDING(1238),
	HOLY_WATER_VIAL(1239),
	ENCHANTED_VIAL(1240),
	SCRIBBLED_NOTES(1241),
	SCRAWLED_NOTES(1242),
	SCATCHED_NOTES(1243),
	SHAMANS_TOME(1244),
	EDIBLE_SEAWEED(1245),
	ROUGH_SKETCH_OF_A_BOWL(1246),
	BURNT_MANTA_RAY(1247),
	BURNT_SEA_TURTLE(1248),
	CUT_REED_PLANT(1249),
	MAGICAL_FIRE_PASS(1250),
	SNAKES_WEED_SOLUTION(1251),
	ARDRIGAL_SOLUTION(1252),
	GUJUO_POTION(1253),
	GERMINATED_YOMMI_TREE_SEED(1254),
	DARK_DAGGER(1255),
	GLOWING_DARK_DAGGER(1256),
	HOLY_FORCE_SPELL(1257),
	IRON_PICKAXE(1258),
	STEEL_PICKAXE(1259),
	MITHRIL_PICKAXE(1260),
	ADAMANTITE_PICKAXE(1261),
	RUNE_PICKAXE(1262),
	SLEEPING_BAG(1263),
	A_BLUE_WIZARDS_HAT(1264),
	GILDED_TOTEM_POLE(1265),
	BLESSED_GOLDEN_BOWL(1266),
	BLESSED_GOLDEN_BOWL_WITH_PURE_WATER(1267),
	RAW_OOMLIE_MEAT(1268),
	COOKED_OOMLIE_MEAT_PARCEL(1269),
	DRAGON_BONE_CERTIFICATE(1270),
	LIMPWURT_ROOT_CERTIFICATE(1271),
	PRAYER_POTION_CERTIFICATE(1272),
	SUPER_ATTACK_POTION_CERTIFICATE(1273),
	SUPER_DEFENSE_POTION_CERTIFICATE(1274),
	SUPER_STRENGTH_POTION_CERTIFICATE(1275),
	RIGHT_HALF_DRAGON_SQUARE_SHIELD(1276),
	LEFT_HALF_DRAGON_SQUARE_SHIELD(1277),
	DRAGON_SQUARE_SHIELD(1278),
	PALM_TREE_LEAF(1279),
	RAW_OOMLIE_MEAT_PARCEL(1280),
	BURNT_OOMLIE_MEAT_PARCEL(1281),
	BAILING_BUCKET(1282),
	PLANK_SCENERY_TRAWLER(1283),
	ARCENIA_ROOT(1284),
	DISPLAY_TEA(1285),
	BLESSED_GOLDEN_BOWL_WITH_PLAIN_WATER(1286),
	GOLDEN_BOWL_WITH_PLAIN_WATER(1287),
	CAPE_OF_LEGENDS(1288),
	SCYTHE(1289),
	IRONMAN_HELM(2135),
	IRONMAN_PLATEBODY(2136),
	IRONMAN_PLATELEGS(2137),
	ULTIMATE_IRONMAN_HELM(2138),
	ULTIMATE_IRONMAN_PLATEBODY(2139),
	ULTIMATE_IRONMAN_PLATELEGS(2140),
	HARDCORE_IRONMAN_HELM(2141),
	HARDCORE_IRONMAN_PLATEBODY(2142),
	HARDCORE_IRONMAN_PLATELEGS(2143),
	//Runecrafting items---------
	RUNE_ESSENCE(2258),
	AIR_TALISMAN(2260),
	MIND_TALISMAN(2262),
	WATER_TALISMAN(2264),
	EARTH_TALISMAN(2266),
	FIRE_TALISMAN(2268),
	BODY_TALISMAN(2270),
	COSMIC_TALISMAN(2272),
	CHAOS_TALISMAN(2274),
	NATURE_TALISMAN(2276),
	LAW_TALISMAN(2278),
	DEATH_TALISMAN(2280),
	BLOOD_TALISMAN(2282),
	RESEARCH_PACKAGE(2284),
	RESEARCH_NOTES(2285),
	//----------------------------
	RING_OF_RECOIL(2286),
	RING_OF_DUELLING(2288),
	RING_OF_FORGING(2290),
	RING_OF_LIFE(2292),
	RING_OF_WEALTH(2294);
	private int itemId;

	private static final Map<Integer, ItemId> byId = new HashMap<Integer, ItemId>();
	static {
		for (ItemId item : ItemId.values()) {
			if (byId.put(item.id(), item) != null) {
				throw new IllegalArgumentException("duplicate id: " + item.id());
			}
		}
	}

	public static ItemId getById(Integer id) {
		return byId.getOrDefault(id, ItemId.NOTHING);
	}

	/**
	 * @param itemId The ID of the item.
	 */
	ItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return The items ID
	 */
	public int id() {
		return itemId;
	}
}
