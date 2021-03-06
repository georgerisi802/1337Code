package countUniqueCharsAllSubstrings_828;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountUniqueCharsAllSubstringsTest {

	@Test
	void example1() {
		String in = "ABC";
		
		int expected = 10;
		
		Solution2 sol = new Solution2();
		
		assertEquals(expected, sol.uniqueLetterString(in));
	}
	
	@Test
	void example2() {
		String in = "ABA";
		
		int expected = 8;
		
		Solution2 sol = new Solution2();
		
		assertEquals(expected, sol.uniqueLetterString(in));
	}
	
	@Test
	void example3() {
		String in = "LEETCODE";
		
		int expected = 92;
		
		Solution2 sol = new Solution2();
		
		assertEquals(expected, sol.uniqueLetterString(in));
	}
	
	@Test
	void oneChar() {
		String in = "L";
		
		int expected = 1;
		
		Solution2 sol = new Solution2();
		
		assertEquals(expected, sol.uniqueLetterString(in));
	}
	
	@Test
	void toughString() {
		String in = "BABABBABAA";
		
		int expected = 35;
		
		Solution2 sol = new Solution2();
		
		assertEquals(expected, sol.uniqueLetterString(in));
	}
	
	@Test
	void longString() {
		String in = "DELQGVWNZKIJJPSXOVWWIZUXCEGWSQLESNSRBMKZARFPAXSVWQEZDENDAHNNIBHGHTFDLPGDLFXMIYRFNLM"
				+ "XHNPIFUAXINXPXLCTTJNLGGMKJIOEWBECNOFQPVCIKIAZMNGHEHFMCPWSMJTMGVSXTOGCGUYKFMNCGLCBRAFJLJ"
				+ "VPIVDOLJBURULPGXBVDCEWXXXLTRMSHPKSPFDGNVOCZWDXJUWVNAREDOKTZMIUDKDQWWWSAEUUDBHMWZELOSBIH"
				+ "MAYJEMGZPMDOOGSCKLVHTGMETHUISCLJKDOQEWGVBULEMUXGTRKGXYFDIZTZWMLOFTCANBGUARNWQEQWGMIKMOR"
				+ "VQUZANJNRNPMJWYLVHWKDFLDDBBMILAKGFROEQAMEVONUVHOHGPKLBPNYZFPLXNBCIFENCGIMIDCXIIQJWPVVCOC"
				+ "JTSKSHVMQJNLHSQTEZQTTMOXUSKBMUJEJDBJQNXECJGSZUDENJCPTTSREKHPRIISXMWBUGMTOVOTRKQCFSDOTEFPS"
				+ "VQINYLHXYVZTVAMWGPNKIDLOPGAMWSKDXEPLPPTKUHEKBQAWEBMORRZHBLOGIYLTPMUVBPGOOOIEBJEGTKQKOUU"
				+ "RHSEJCMWMGHXYIAOGKJXFAMRLGTPNSLERNOHSDFSSFASUJTFHBDMGBQOKZRBRAZEQQVWFRNUNHBGKRFNBETEDJ"
				+ "IWCTUBJDPFRRVNZENGRANELPHSDJLKVHWXAXUTMPWHUQPLTLYQAATEFXHZARFAUDLIUDEHEGGNIYICVARQNRJ"
				+ "JKQSLXKZZTFPVJMOXADCIGKUXCVMLPFJGVXMMBEKQXFNXNUWOHCSZSEZWZHDCXPGLROYPMUOBDFLQMTTERGSSGV"
				+ "GOURDWDSEXONCKWHDUOVDHDESNINELLCTURJHGCJWVIPNSISHRWTFSFNRAHJAJNNXKKEMESDWGIYIQQRLUUADAXO"
				+ "UEYURQRVZBCSHXXFLYWFHDZKPHAGYOCTYGZNPALAUZSTOU";
		
		Solution2 sol = new Solution2();
		
		sol.uniqueLetterString(in);
	}
	
	@Test
	void longerString() {
		String in = "OBXBYZTNRTJRSHWNWJXQACMCZTXWAJCAGOHOBRMVRJZAFIJYFNPHDIBPJATZXHVTPSELQATXKKXDQPMJSPSQYT"
				+ "DTKFGNYBRXARMWVHMYESBIBMXEFTDOYEFRYYDZZAEDBMFWQJCQTRBLRYGELLUOEKDBPFALUKHAMMBBAASJELBMM"
				+ "XXRKTJXBNCCPDDNZTXHPCLGHYEYLIOQQTZHADRTPGDCYEMIOJHMBQGAFZLYVZUHRWTURHQUCMRJWKQVLRUSRYDDU"
				+ "TEIZXZOKLDSYXIHECRKNFWJMOBUXLHAXABYLAGFWPMKOSLYPCDWMPSWJHAPGMKWJUSVIKEFKFVHJPWOPUPCATNVH"
				+ "YVHWYOITGWQPOPLJUIKJODGQBQRSXMYFFWRIQXVPKBHREKBQOYKNOEJJNRHGKGPOMVEHDJQHEBPWEWLXIHOXYYJJ"
				+ "TYRBGREKYPSGXYHHPXKJBAKMKLMMFQMWVMKKXMHLAQVHVECSVCJBRZABLSYCMHSIUJJRESMWECOLLPOOMWZSPDOQH"
				+ "NGTPDJOPLXOIRERFUWIZBYDNLTRJRMJETWYOUCKWHKKGULNTGXBYQDVRLAYYKERCDBGHWTWCFSPNLXXKLLTGEOYV"
				+ "LYBJSNINSQAHKJHDWPDQEFFQTSVAMVCTTURQQPJPTXXKVTSLECEKSBSIXDLSTLZNWMZIXQPBNIMKLAXPUQEAM"
				+ "LSLJOGQWEKLKLBUPOSAWLTJPNWZQIGVPYBHVMVJCSKOHSVNKCPBQVSPHRNZXLVVQYORZFYXBFZGEGPEGNFYNOIC"
				+ "RDKXISLZTWWWQVOTXXUKGKQSHBOHZTFORJJHIXKBCIWGTRIQOSHYAWENYYIAFYNIJMJDBTULFJIBHPORJBUNZBB"
				+ "IORFVLEUUHIGOGWPQOQDYLWFAEBFDRZFTQVDVUWAQVTCVFNBYSFQEAYFVXJFUTMOBITHKUTWKHTYXSVWUOZJMTD"
				+ "ATAUPZWDZIJEMOSRUUBZURNHMSJSNDWDAGGIVFYTKNZVZNVVDCRANJOAWFMFRLMWXDMUJXDHFVIUDPWCKUIUEZZ"
				+ "HNOPIBTAVESYITODWFWLWPDCCKECQVOGRWEEQALVFSXSGBJTBAJSURTLEWDIUYHJWKXZSHVQFUUUSAYTLSNTBNW"
				+ "NLRRHQURJARXZFMRVRCTXMUDWOWRXBDOPWCCVQHUZUOQYZSXWARBAJWEJDTUACADHPTCNOKIRGTKXQHAYMSRFOFD"
				+ "JQKCMPJTLTZEUYFPVKGAUDADXIWGJTNNIDKJJRLIQVLUQOTHWQBBYGWRGEASAVRILFRRFFCWXTQZHSIVAAFZWOX"
				+ "OIWFLIQPPOONJMPWBFPZBIUAICMWVTXXFNEKBBVFBTTMSAZPUIAPSBRYTPWZAJBOVNZKDHUHXVZRQGTATIWDZIV"
				+ "TKADFARDFEFYQQDVMLEJZHTVCTGWEQFDLEJCVIWOYVZIMBMKUPFWDJKTVJZXXDILVXORORSNFDEMEUGDBRHXOE"
				+ "QDRYKHRLMLAFYSDDVYMIRMXRQCDZRXDSPXJXRIEINAWXFGLLOZYYLRYIDFDADJEBXPLPCZGQPZAESADSAYMCUY"
				+ "XUYRMWUKJUMLUTZTUHSPOEHXWGKZBEDNGOBLSTFYODDZWKDVFLFSLCUKDGLSIWAGNCIELBKIEBEBFXXJATLFLD"
				+ "VOVIKLVJLMVSMYTEFWJAYQDBHVDNCZEGRKTMOWQKOFLMEKKCFVLKZCAFQCYDAJCXKCPBPSGALSMJLLBUEXSKDM"
				+ "WCVSEPMOJTBUFKNAAYJVTIARMJDYETIMNDSATWSEMLQOMFTQYHREQGYJWXPXXMQNFJZPMGELJMYEALYWZYMWUTK"
				+ "DYJUDEHHXPKOLGCHRCRUSYKMHBRCHJVRTLDYFASBCFFPORUUVALJHEWONGGOAEOJRHROUQWADRMKBUXBUABRVRF"
				+ "RWTORKKUCAFJCOVGHQSOZTWEXLRYENNIZQYQRGQHMEBGMOHORBIDDUFIDRPGNBDKNOMSMHGOGKZOQBDNMUYMQUF"
				+ "AMMAYVUZMYZNGBESWZHWHZIWCRFSHJHRPEMDXNQJHJMUIIMKORSTZPFXWGXHNLBZHFXEPWKDOSOJZGVTAMUSIL"
				+ "ABETTDFGUSKVVBVZTQUTZFOPACSJCEEMMJNLVHZKOXJQLSYUURLYNOBZPRWGLNYLNXVFTPBWCZLTTQNDKQCVAHP"
				+ "VMWYOKUTAIEBKSXTCCBOFGYHLXJGWVOWTAAPFJFRFMMXXYHVERRCXRAUEDCLCRNVSXPVVTNMKRFFLBCAFMMFTI"
				+ "RBTQNCMJOPMKPMNELDWVHFCACJYEDCORMXXUOEJJPAYMVLSXLLWLJFPGKFDXNHBWLSVLAPIXLZAPTVNTYYKUY"
				+ "RPXWOPVDYARIXFEIKQYXUWWWQQWCTKRTPYQFEZDDBWLWVJGXZHMECLVXWJAJWGJYIJIZJFEJMQVOSJITNAKKA"
				+ "MIVUMSAOHJSCDUYFUKSZSKYOTGTWHQCEGXWUWELTMKSXUHQBDXTMQKRZDGISSQPVTDAGYMUAMIZGGXBCIDFKU"
				+ "JORGMIKBZJHHJOOGWMCBMUYQIDUNNLYHQJMVNPCNNNQQFGRNPTXXMNQBWPRJJYZKEVDYHVWRLROZZVINUTFTAA"
				+ "ABSEJFDWIMDIEYJWTFMSFRLSFHGXCLWEFBWQQHTBDHXBSVLKXTXYKRKENBRASKDFYMDNZBLVPOEMQXLAMKDEKS"
				+ "UNNNQGAPSRTEMCAMKXGFPLEAICIIAHMBVUBZWYICVAUNDDDKBDOARBTNUNMKYGWRDCWSIMDBKUGJYQIVDCAQB"
				+ "ENRBJSERLUBDEPDDYXXLJNERXQIBQFCSBKMLBYIMMWISJQBJKEDMAMZQJTWBXGLDARYNVIPFBJCXNPVFDYPOT"
				+ "RHYYMZMNBWEJXKDDBHTZEXHVYNIDJUJGOEEEEDIBBWCRZFXZNWQVILWFDCULRNLZHCPWEGUGHMQXUAWNQYRWX"
				+ "XWYHRIFUXRFEJVWSVQZTETQTUVHXEXPZVAIWTDCNLHBHUZKYCHQNGCHYGPUCAETUOTDZUIOPYCEAAOFNNUNH"
				+ "XNMFSTCJKIKPMNYNNVDDLNIBPHWXMXYRUKZCTMVRDGUJAXWLZVVAICBXKYUGAMFSFOOYOQSBRIAJPBMUCLKOPOG"
				+ "QGDSDXLYWUUAIHQRNJDXMCASCJOLKIENDTDCNEEIRBCYACEBFHTBDXOQECADTLGXURECTFFENBIGOJTOZRPTAD"
				+ "XRJKODOHUMAXEVTWRNDKSTOXCQOKJIZAYBJLISWBLAIOMAUQVEBRTGTHFLOLVEVSYQWPMRYPJBIPLWXOMQMJHZZ"
				+ "UDCZPMPEZCHATAUGGPZQZKHSQBMXBUIPVBRVZWLVEXGIOCLWIVUJCNVMOHAGJTGDYHYTJCTAMDMAWYIMRBVSUX"
				+ "PKDDGEFBOHUCWCURTYTAEAISAGSRNBNRSJLNBUVCFEUHVHPOVRBLDHSVXGBTPTRDLLFPYSDVLGCVTPRCBKXVEBG"
				+ "FIVABRHGXOWENTTMRFFUHVTTWDTXTVBIFIJWFUWJPAZILOZDQMYFMCVUUOEJPKVMBLRTARNTLLETFFCXKOIANVN"
				+ "HYCIDXQHYKCNNPUTRFXZXDHDCCDDIWTSHOEEQYFKRFABDKEGPLEOPLMTAHFHQGHDFZBFZWECSTTSGKPYEIUOHLJ"
				+ "OFPKXBXCAUCDRUQSUAAYKGUOYLNLGZCDUUAJNOXIPTZPUZOCBRWRNBPVNCJDMFVAUZAUBLQUDLGMVSEPZJISZSI"
				+ "GVGNYZRGLOCIZABFTAFLNRBNENIWLAMQVUBYCVRIIVEJGTWISUKOMYJBKFMNVOVZKMVBNQRJCKNDTEAFWCWWNQV"
				+ "YLNZOXJGGATNCFDVPYGETKDDXWXLGBAZIZSKYANTMZTXDOCCEPWPONJWNSIUVVQHNPJSSNMLFLKQIBEYBFGOMPB"
				+ "UZSFZPQETUXKUHXTBJBGBZDGNSLYIRWZABNJLOFBEMICGGIAFTGTNZLIUOBUXBFKWAKKZKSPSCUCZRHRIALIQJS"
				+ "GVBZNDRADQNBIGMPUELDCQWJGTQBJQPCIVVIISKMEWOXNPRZLIOEPPRNLZTIZAMORWUKQBVUYMGCCKZHGGBLLDZ"
				+ "FOPUMBUEVBUYPEWKVBOBCPZWBDTXYJUSXKRTVMNUNUMGTTOKAPOHUFPKTPEEBQPEPCMLWBFVQRJMLSHJUTSUBEM"
				+ "QGGHOQJBTPGITIHSTGMAETBQVSJEPIWDORSKDNAVDAZHVCDEMEUJXLFSQLRNVPKRRVISIVEPHREMXZPWKBDKNBI"
				+ "KHKMTDTOUAXEIGMRUJYZBBNDDYDJIVJCSHXHKAVHIZRCZEYOFZFOFBZADGPLTSSSIOMUJERBZLAOOXGFBXYKWT"
				+ "BGOMKHGHVASLBHIYMSXSIEEJDOMNHPBLWJSKFEOYSJOGSAIKVBATFYQKBNYUQYTMXNPUYYUZZULBUVWPEHAXWQN"
				+ "PKYAUUFCNRBYLWOYUIABMSGHWTXYSYKWRSOTCUZMEMJTTLAANDWNUANDCJAVTPIRFPEPZGUGIEZJTKKUJCTXMEL"
				+ "ZJSRSXJMLJPWFLTRWPFKUVCJUBIFKNHIGCDNSSZPECAUNXVOLDKEVVSPBTKXXMLZKUJITITNWYOVGTNSJMPWABX"
				+ "SBOJIBBVFKEWJMDSXHIGFDJLNWOVCPQFBJQOLJSRUXWTQBSIKQFMXFHABSBMFKTUDGCTPFPSNQVWPLBYVGACBXE"
				+ "AHHTDPOWZWLRGBZIVHGHSXCFYTPWHVZVUGOFHKJHYDJGDUMRWRVAHNYDHORWESMVFMGNLKLBKXORPQBNUGVKATX"
				+ "YYHJEGGNKSCKKLQWWGDIRGCWEYTWOFAOYWFBPZHNZNJSQNGFUXOCAATMLOSIEALMTYEGWDPVXWYITBBZBWSPRVI"
				+ "UEAYYMWGUOMDBEMIVYAADGLPLEFUSRAKDWZAGUVZXXODDTIYPHJZRAGQKFLDMUFMWFWQTVUYEGWMNVZHHQUJQBX"
				+ "HYFJHMCZXUUQCLKVXFFZYYZIOEEDFUWWBCBYXPQWGIUMMJKBOTZQORZQANBRIUATTHVJJQAMVVBJJTCDAVJXXT"
				+ "AHRFBGIMDFROFZBLJJMXKCRDBPJNUIHZICKIYPALHTIZZGUGZIYBCISBWWOKKEXEVVESNHJHANMQBANGTIZNZN"
				+ "SNWUOHYOSLQDVUXSOJBZDQPCPMXCJUSSBNMVGDPYVDFQKXRAXFSTCPKPNOYDFQPYRHKNJSEOJLEKLFYQJNIPWQY"
				+ "XXRLTAFRDGLZZKVXKOLZSHUIUOCBPFIWLQGGJBUSVXGHEPJRMLTGSNZAENASTJXKXTYKBSKFTMRPASNZFPTSJVAL"
				+ "RZTGPBHFNIVXLGFINPQFHSKFJDRCQSMIHKNLVCMOPUVHZYDECIFSOBWRYWWNZGJKBPHHSQKDVTYKQECVNQHQZST"
				+ "FKMSSJKFPYWUDRCSWULZNCWSZYOOQZRTDZBZIFFHPTNTPXXMVIYTBLLAJKYSROPNYSPGZJIPVKUEJYEOKWCJDKO"
				+ "OPJJYCFVJJCVKBXPMSJVRWYXAVZTWHIVKDPTWJCWMVNXXOBGHWAEAUVXGERQSSCYTBOKDBLLTMKTBMTNRRFSRBE"
				+ "GTLJVKGHJLKWILDAFBNCUATWSRISXHMKOZHKLYSMNNTLGNHEPVVEZFQIVVOPLCWJQXWGTBWOLFZBABYZSNVQAJ"
				+ "OIYVVUMYWBBCFMGZJDFSSKLWMTVQZHXIRSJZVSYNNJADBLRJVKFEPNAKCKIPJKBCBDRKKZHDKWZVHSSDMHQFBM"
				+ "LRPQREOKWOJGHUUXSJDQUCPOHIENFLMPYMXYKWFZMOHNGKIOWTCCUHEWPDULSTGZQVDDFYZERWSFAQRLTVVPJCB"
				+ "FDWRJAHPBUSLYIZDTQUNSDCLCCSRAIWRTZVXRBSDEBQOCIIIFQNFLPBWCYMXRJZMMTKNXIQGGSIPPWZKACUDORU"
				+ "RRTXDUUDJYIZUPYZNXKTGFWOFIFLEHHDQMTPCKJIEEFHXACBIKNJKCQXCWICSBXTRJEQKRKICXXXMOKIJHORUYC"
				+ "TWBXCFLCEMSOYSNLPHZVSSLEISJQEDTJRKPEQUEHOMNTNXULZDQPGORLXODGRHBFXMNCXOLABLUWNSKXYKEMFY"
				+ "EITKTPISSOOIPWHQHGHTACFTEYVDAHAERYBFHYYSRIUUNAALMGHPPREPAVSEWKFXZJVTTITPVLPUSMTREZIASYO"
				+ "HSMMPNFTUGMLLOTSEZSGLUZWVDMJPRDUQMLDRLZYGEDPDFXOKMHODGYDIEMUFZDWRLIYDRILPXREJOMNAPRJQCA"
				+ "PTYYMENVXFZUTQGVPVHZWUEXDOUURUJZXZEBOKTNBAWSIIYVENXNGZSCIQFCUSKYEIFSTVRCBULDJTBEPNXSKHL"
				+ "MAFJCTPJTGXIAOLHMIKVNYNNZQGUJRFBIHVCRTWWOFSGCULSCQURUUKNLWMMKKZBGNTVBJEUDPPFMXXQQWDBXVW"
				+ "MEBESGPDOIBOSYELQSPWBXHXUSOHXWZZDZHUBUPBKVFTSBMHKGHOKBNPFOTWEBYNPMIOANGOQYPHZMDSZFBPYSJ"
				+ "HRJOUWMYESWKJKNSHQDJWJOGXGQSBSXRGIUBYWJLKNRRIFXXIRIEBUONMNHMXDYLRKLSSYXQPXYILPOGSVDYTNZ"
				+ "SFQPTFFCYEDOCRMLCAFMNRJASUVCSPWGXHFBSHRCCDPJMHFBRALIYKIIFYBMYIAAPYQSGKULURNXOTQAMNEGPNG"
				+ "DOZHXVUPDXJUQTQJABQQTFTZVBCYWYIBOVMEMCOEHZVYEQWHLZBBGOLVRYBGOVLQLAAQPTIXMEADKAZTFPEKMFV"
				+ "BCERXHHBEHUZJELDOMCHPZIWHLTVDMBJUYSYXBIABEUKSTDTMLREYPLJBBNEKPUGAFPOJQTLPCQRICFOZTUQXGY"
				+ "TEKHDEVFFTGWCJAUVDEMMYJQCBWPXUXCAZIUEBJYWSLZXKSHQDBHBPUESKRPDDLJJNXNCEFOZOYQWIJBMJSOFGW"
				+ "FHXFZGMZTQUGZJPYGIUGYBFSFMMIYUWTDIWNFMMXVJITFKCVBQRMEMRKKSBDUDHVWOPCAKCHVYVTIKSQVUOTZNF"
				+ "IEOPTMAWBXTOZXHZHXYKUYXSRPBCQUVETWJESIKMIFYNRENQDURSWORALUSZDPEYPESLFYCFDKTZRETDAQIWXRJ"
				+ "WGFKKKJYPWSPZRQODTJHHHHPGBDGQPDHOVXDOIITNVQDZQVSNCDAWFLSBNLDOVKNMEBDMETONQDGNVHBFFZWJJ"
				+ "XODMAESGLUSLTTEXJBBGCLDPGJZDVFUWJFADPTZYHBWWWIXZREMWTGOCXARXJFWMPNBSYQHWYUWGUVTEFQLPWF"
				+ "PMIYMBYYMPIWBDKXDVWKYEZYOUOUAQHNBGGHDOLTSGNSDIDQWWCHBMGWOVBTGIZABGAPKLHEVYWJKMEVERRAYEK"
				+ "IJCCAIMERANKNDDFDEJICLLMRTHQWCMOZQEZZYZVQKMFUYQSWMGAVESECMLBWNFFKUTXMMULJUMEGJVNHRFWMAE"
				+ "VUVLTMPNWKZJZZBOGNJVQWCBQHYGNYSCHDVMIQIWJWPCJRELXZIIXOOBUUZBYMFYJLKPEACBSMROLPSOBZHWEFX"
				+ "DKJMIPNEMKLFCRAIXTIMEGGTRGYHATLQPCLWRJFQMOHKNHBJRGZVGSRJZDEPFCONBKQCZWTZSEMDUDIJWMNQTHU"
				+ "LBOQCUMNFXIALANSFTMKVXEFXJIEOBCBMHBNHJAJHPZCHGXEGEILGYAUROOUCODQVZZAIILGDWRLEQDJODAEVLX"
				+ "SDCVYETZOLSARQCIZCOPLXZDTCUOOXURJDCRAAKCNNTQAHBFWZDZDUNXTXZPVMSENTXYTPOBGPNAHJRKRLDATFB"
				+ "JVWPMHXZMJLSHSRLMZZZZIVDFWBJJPPZDPZUYYVBQZQQGQZFOJOQVUGOEUSDNQDRKVQKBPFBFDXTCTCCWCEJNYG"
				+ "EQJAQZLEJRBVOXIXNUVERKFORUUYQEGIZWMWNQWROMHWJVPOTOLXDZOMATYNKIUONFEJXBUBRAMQKTGERCTAVFT"
				+ "NSBLGCSVEVUOGIXHCPJWAWFZCABBQINTFHMCUNHFTPBJGGNMKUVMRZHVFGPUZEUSSFFDCAFPMBVXAXJSBREPBV"
				+ "RVZPPZWQEFIPZYMTPARCHGTMGGQBKUQSUDWSUYYXTRQLBKSIOIIBUJLAUWHRLPMOVCEECILYTNINLZFQTVDNEIIB"
				+ "ZQHYIXAMVUCUGEZFIBSKNPBCLJSZZLIBJCIZTZDIQTFXSVYTIYIHEHLIWIQQUCXLIBHIATBYUVKQAZFTWJXWTWDS"
				+ "QCMTIQMGWZNUHGLFKPVVXHXOIRAOHCKICPKMPUXZMJFNUTTXMPPVDGAJRQGMLPXKRUWGNMJMEQWRYDPDNCBXNGIF"
				+ "ERQFIIMGRKHWPCLKZGXFMYJDDSHQEIGAKSBQHXONTPXUUXBSTGOZDESOREQUKRHRFJIOJBXPUWTSUFFOBGLMDDK"
				+ "KHWRAJOGPJEHPOOHJXUVMQSFDDOHVWNBDGTHMAIQGBNRAGQNSJTLDJWVWBLVKLPXROAQZDTZRFFGKGFVOZDQODTB"
				+ "LLSMIPEWJAOFGTWHBESPGGKSRMZZRIEXTKIMEIZWUIEWCQLTPKSLFBLKIOWSBUBSJVZXODSRQUZXXHZSFJVBDLAJ"
				+ "AKQTAWHPBRXVMQXGNGEVJFDMNUPXGGZRYGYWCZVDVNXUIWTUMNZGCUKMQVRNXSBGYHNBZHEDSEWSSSSHBCFJJZF"
				+ "YBNORJEGPFLPCIGWJAZIBZITVFJVRNXBWZKEPLBQSRVJESPFHNITENBBJKUNGHZSQHSMEBZJMWSXRZBFNFJTQKP"
				+ "AGNAKMIEAIZTUPHCYEWCIZKIZRSIHDRMOEAEZUNPSXVHQPRTDESTKSIHNIUNCJLKCFQTJTZDQIKBJLNUVJKSDX"
				+ "SDGCPSHEDTXCBZWAHFAXWTGXYIMNXNGXNDWTZNLZLQHGCWQDJLMHZDUYONQACSTHEXUIPDRKSGMBDGMILLNFMMYB"
				+ "JVYCOKWNAEDMRJNRWLKAUUHBVROWIMQLSXBIYMNMUDSWMWJPDZEDCCFNQEIQUZBXQNWQMHGPAFCJJIBCSSPVGYL"
				+ "VJGFWWSZBTLZIXBQOZCPAPVCURCPSEDEOBCDQRRNNWXAYVBVGNIVYSNJHHDPFQZSFTIMCYNIXJIQIZZRJYWZKSXO"
				+ "QZUCALDWIJXJQENIWDYWBXJVESRQTOEEKFMEJCKTBMOYVEQQAANECKLFBAQCUCMKBKFYKFYVOBBGCQZCKTTQTQHR"
				+ "YTZHEWKGDDBGBOSHSMWFMIETKJJRNNSVSCLBURNDHYEXJBFWKAEHDKDUHHJSRCGOECWVUASDSRGSAQRVWCFGSMXB"
				+ "EVIYHQENCCGOXAZESHJIJMXJWJOJQRJGKFIUBVALMDIGDUMAEXWQANDGCJNCAOIYOJDQPCTKHLJXJDTXNLIYOKTB"
				+ "WJXGGGERIMPZPISEOMSPQJOPVOVQJHAXIAMNNYTJNRKTVEARVGQYHNSGXGCYCESNKHZXDPOBDZKPRIBIPRHCRYOI"
				+ "HZBRFDUOOGGFFSGJPAKTBZBYIEPVBIKNBEFTVNHAFFXJHROVXTNWOJYGFZEHUHJGBCQCSQYTJBDINYWEUXQHCWFL"
				+ "VITTSGWGHLWVRUBJCVAHBUBOBYQDDEIZMRLRAZZTIXXSGVOGNMOBFQUFSCCEZKOGOGJFDVWPWRTNBGBJZERXBSEZ"
				+ "YPJDVWUEPGIKZZBAAITXSMKSDOUYTOJMBEEUPNVKIWBFDZSDYNOYROVCDOAYEAOGCDQYAIQWUJHGRUWYDNDPTCIH"
				+ "FYKRFBBBQOCDIUBWMWSKRKBIRPUNGMJQVCKBOWBWFZKZHSXGHBNHSEAGSUSZYEVKFIJZGJHKTWEAFVZVQVCVDCRJ"
				+ "GJQJYLLUBQAXWGSTGSZXOXMOETCLXKAUWFXVBRNMIXBOSHDMABWACJFRXZGJUNTFNNBLYQJOTXIIHZUPEJGTKDPK"
				+ "TVAAJPHUGOZJTZJCWOLERRGGIXUJRWGAMRTDOWVLKJYOHCUYBJVTKDKCAYDEMNJGPRBYAOVUICGGEDNSAGFPVRSR"
				+ "SNTCURXQ";
		
		
		Solution2 sol = new Solution2();
		
		sol.uniqueLetterString(in);
	}
}
