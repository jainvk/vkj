import org.hamcrest.core.Is

import static org.hamcrest.MatcherAssert.assertThat

/**
 * Created by jainvk on 12/25/16.
 */
class PermutationTest {
    Permutation permutation = new Permutation()
    @org.junit.Test
    public void correctlyFindsAllPermutationsOfEmpty() throws Exception {
//        char[] str = ['c', 'a', 't', 'd', 'o', 'g']
        char[] str = []

        def permutations = permutation.getAllPermutations(str.toList())

        assertThat(permutations, Is.is([]))

    }

    @org.junit.Test
    public void correctlyFindsAllPermutationsOfSingleCharacter() throws Exception {
//        char[] str = ['c', 'a', 't', 'd', 'o', 'g']
        char[] str = ['a']

        def permutations = permutation.getAllPermutations(str.toList())

        assertThat(permutations, Is.is(["a"]))

    }

    @org.junit.Test
    public void correctlyFindsAllPermutationsOfTwoCharacter() throws Exception {
//        char[] str = ['c', 'a', 't', 'd', 'o', 'g']
        char[] str = ['a', 'b']

        def permutations = permutation.getAllPermutations(str.toList())

        assertThat(permutations, Is.is(["ab", "ba"]))

    }

    @org.junit.Test
    public void correctlyFindsAllPermutationsForThreeCharacters() throws Exception {
//        char[] str = ['c', 'a', 't', 'd', 'o', 'g']
        char[] str = ['c', 'a', 't']

        def permutations = permutation.getAllPermutations(str.toList())

        assertThat(permutations, Is.is(["cat", "cta", "act", "atc", "tca", "tac"]))

    }
    @org.junit.Test
    public void correctlyFindsAllPermutations() throws Exception {
        char[] str = ['c', 'a', 't', 'd', 'o', 'g']
//        char[] str = ['c', 'a', 't']

        def permutations = permutation.getAllPermutations(str.toList())

        println(permutations.size())

        assertThat(permutations, Is.is(["catdog", "catdgo", "catodg", "catogd", "catgdo", "catgod", "cadtog", "cadtgo", "cadotg", "cadogt", "cadgto", "cadgot", "caotdg", "caotgd", "caodtg", "caodgt", "caogtd", "caogdt", "cagtdo", "cagtod", "cagdto", "cagdot", "cagotd", "cagodt", "ctadog", "ctadgo", "ctaodg", "ctaogd", "ctagdo", "ctagod", "ctdaog", "ctdago", "ctdoag", "ctdoga", "ctdgao", "ctdgoa", "ctoadg", "ctoagd", "ctodag", "ctodga", "ctogad", "ctogda", "ctgado", "ctgaod", "ctgdao", "ctgdoa", "ctgoad", "ctgoda", "cdatog", "cdatgo", "cdaotg", "cdaogt", "cdagto", "cdagot", "cdtaog", "cdtago", "cdtoag", "cdtoga", "cdtgao", "cdtgoa", "cdoatg", "cdoagt", "cdotag", "cdotga", "cdogat", "cdogta", "cdgato", "cdgaot", "cdgtao", "cdgtoa", "cdgoat", "cdgota", "coatdg", "coatgd", "coadtg", "coadgt", "coagtd", "coagdt", "cotadg", "cotagd", "cotdag", "cotdga", "cotgad", "cotgda", "codatg", "codagt", "codtag", "codtga", "codgat", "codgta", "cogatd", "cogadt", "cogtad", "cogtda", "cogdat", "cogdta", "cgatdo", "cgatod", "cgadto", "cgadot", "cgaotd", "cgaodt", "cgtado", "cgtaod", "cgtdao", "cgtdoa", "cgtoad", "cgtoda", "cgdato", "cgdaot", "cgdtao", "cgdtoa", "cgdoat", "cgdota", "cgoatd", "cgoadt", "cgotad", "cgotda", "cgodat", "cgodta", "actdog", "actdgo", "actodg", "actogd", "actgdo", "actgod", "acdtog", "acdtgo", "acdotg", "acdogt", "acdgto", "acdgot", "acotdg", "acotgd", "acodtg", "acodgt", "acogtd", "acogdt", "acgtdo", "acgtod", "acgdto", "acgdot", "acgotd", "acgodt", "atcdog", "atcdgo", "atcodg", "atcogd", "atcgdo", "atcgod", "atdcog", "atdcgo", "atdocg", "atdogc", "atdgco", "atdgoc", "atocdg", "atocgd", "atodcg", "atodgc", "atogcd", "atogdc", "atgcdo", "atgcod", "atgdco", "atgdoc", "atgocd", "atgodc", "adctog", "adctgo", "adcotg", "adcogt", "adcgto", "adcgot", "adtcog", "adtcgo", "adtocg", "adtogc", "adtgco", "adtgoc", "adoctg", "adocgt", "adotcg", "adotgc", "adogct", "adogtc", "adgcto", "adgcot", "adgtco", "adgtoc", "adgoct", "adgotc", "aoctdg", "aoctgd", "aocdtg", "aocdgt", "aocgtd", "aocgdt", "aotcdg", "aotcgd", "aotdcg", "aotdgc", "aotgcd", "aotgdc", "aodctg", "aodcgt", "aodtcg", "aodtgc", "aodgct", "aodgtc", "aogctd", "aogcdt", "aogtcd", "aogtdc", "aogdct", "aogdtc", "agctdo", "agctod", "agcdto", "agcdot", "agcotd", "agcodt", "agtcdo", "agtcod", "agtdco", "agtdoc", "agtocd", "agtodc", "agdcto", "agdcot", "agdtco", "agdtoc", "agdoct", "agdotc", "agoctd", "agocdt", "agotcd", "agotdc", "agodct", "agodtc", "tcadog", "tcadgo", "tcaodg", "tcaogd", "tcagdo", "tcagod", "tcdaog", "tcdago", "tcdoag", "tcdoga", "tcdgao", "tcdgoa", "tcoadg", "tcoagd", "tcodag", "tcodga", "tcogad", "tcogda", "tcgado", "tcgaod", "tcgdao", "tcgdoa", "tcgoad", "tcgoda", "tacdog", "tacdgo", "tacodg", "tacogd", "tacgdo", "tacgod", "tadcog", "tadcgo", "tadocg", "tadogc", "tadgco", "tadgoc", "taocdg", "taocgd", "taodcg", "taodgc", "taogcd", "taogdc", "tagcdo", "tagcod", "tagdco", "tagdoc", "tagocd", "tagodc", "tdcaog", "tdcago", "tdcoag", "tdcoga", "tdcgao", "tdcgoa", "tdacog", "tdacgo", "tdaocg", "tdaogc", "tdagco", "tdagoc", "tdocag", "tdocga", "tdoacg", "tdoagc", "tdogca", "tdogac", "tdgcao", "tdgcoa", "tdgaco", "tdgaoc", "tdgoca", "tdgoac", "tocadg", "tocagd", "tocdag", "tocdga", "tocgad", "tocgda", "toacdg", "toacgd", "toadcg", "toadgc", "toagcd", "toagdc", "todcag", "todcga", "todacg", "todagc", "todgca", "todgac", "togcad", "togcda", "togacd", "togadc", "togdca", "togdac", "tgcado", "tgcaod", "tgcdao", "tgcdoa", "tgcoad", "tgcoda", "tgacdo", "tgacod", "tgadco", "tgadoc", "tgaocd", "tgaodc", "tgdcao", "tgdcoa", "tgdaco", "tgdaoc", "tgdoca", "tgdoac", "tgocad", "tgocda", "tgoacd", "tgoadc", "tgodca", "tgodac", "dcatog", "dcatgo", "dcaotg", "dcaogt", "dcagto", "dcagot", "dctaog", "dctago", "dctoag", "dctoga", "dctgao", "dctgoa", "dcoatg", "dcoagt", "dcotag", "dcotga", "dcogat", "dcogta", "dcgato", "dcgaot", "dcgtao", "dcgtoa", "dcgoat", "dcgota", "dactog", "dactgo", "dacotg", "dacogt", "dacgto", "dacgot", "datcog", "datcgo", "datocg", "datogc", "datgco", "datgoc", "daoctg", "daocgt", "daotcg", "daotgc", "daogct", "daogtc", "dagcto", "dagcot", "dagtco", "dagtoc", "dagoct", "dagotc", "dtcaog", "dtcago", "dtcoag", "dtcoga", "dtcgao", "dtcgoa", "dtacog", "dtacgo", "dtaocg", "dtaogc", "dtagco", "dtagoc", "dtocag", "dtocga", "dtoacg", "dtoagc", "dtogca", "dtogac", "dtgcao", "dtgcoa", "dtgaco", "dtgaoc", "dtgoca", "dtgoac", "docatg", "docagt", "doctag", "doctga", "docgat", "docgta", "doactg", "doacgt", "doatcg", "doatgc", "doagct", "doagtc", "dotcag", "dotcga", "dotacg", "dotagc", "dotgca", "dotgac", "dogcat", "dogcta", "dogact", "dogatc", "dogtca", "dogtac", "dgcato", "dgcaot", "dgctao", "dgctoa", "dgcoat", "dgcota", "dgacto", "dgacot", "dgatco", "dgatoc", "dgaoct", "dgaotc", "dgtcao", "dgtcoa", "dgtaco", "dgtaoc", "dgtoca", "dgtoac", "dgocat", "dgocta", "dgoact", "dgoatc", "dgotca", "dgotac", "ocatdg", "ocatgd", "ocadtg", "ocadgt", "ocagtd", "ocagdt", "octadg", "octagd", "octdag", "octdga", "octgad", "octgda", "ocdatg", "ocdagt", "ocdtag", "ocdtga", "ocdgat", "ocdgta", "ocgatd", "ocgadt", "ocgtad", "ocgtda", "ocgdat", "ocgdta", "oactdg", "oactgd", "oacdtg", "oacdgt", "oacgtd", "oacgdt", "oatcdg", "oatcgd", "oatdcg", "oatdgc", "oatgcd", "oatgdc", "oadctg", "oadcgt", "oadtcg", "oadtgc", "oadgct", "oadgtc", "oagctd", "oagcdt", "oagtcd", "oagtdc", "oagdct", "oagdtc", "otcadg", "otcagd", "otcdag", "otcdga", "otcgad", "otcgda", "otacdg", "otacgd", "otadcg", "otadgc", "otagcd", "otagdc", "otdcag", "otdcga", "otdacg", "otdagc", "otdgca", "otdgac", "otgcad", "otgcda", "otgacd", "otgadc", "otgdca", "otgdac", "odcatg", "odcagt", "odctag", "odctga", "odcgat", "odcgta", "odactg", "odacgt", "odatcg", "odatgc", "odagct", "odagtc", "odtcag", "odtcga", "odtacg", "odtagc", "odtgca", "odtgac", "odgcat", "odgcta", "odgact", "odgatc", "odgtca", "odgtac", "ogcatd", "ogcadt", "ogctad", "ogctda", "ogcdat", "ogcdta", "ogactd", "ogacdt", "ogatcd", "ogatdc", "ogadct", "ogadtc", "ogtcad", "ogtcda", "ogtacd", "ogtadc", "ogtdca", "ogtdac", "ogdcat", "ogdcta", "ogdact", "ogdatc", "ogdtca", "ogdtac", "gcatdo", "gcatod", "gcadto", "gcadot", "gcaotd", "gcaodt", "gctado", "gctaod", "gctdao", "gctdoa", "gctoad", "gctoda", "gcdato", "gcdaot", "gcdtao", "gcdtoa", "gcdoat", "gcdota", "gcoatd", "gcoadt", "gcotad", "gcotda", "gcodat", "gcodta", "gactdo", "gactod", "gacdto", "gacdot", "gacotd", "gacodt", "gatcdo", "gatcod", "gatdco", "gatdoc", "gatocd", "gatodc", "gadcto", "gadcot", "gadtco", "gadtoc", "gadoct", "gadotc", "gaoctd", "gaocdt", "gaotcd", "gaotdc", "gaodct", "gaodtc", "gtcado", "gtcaod", "gtcdao", "gtcdoa", "gtcoad", "gtcoda", "gtacdo", "gtacod", "gtadco", "gtadoc", "gtaocd", "gtaodc", "gtdcao", "gtdcoa", "gtdaco", "gtdaoc", "gtdoca", "gtdoac", "gtocad", "gtocda", "gtoacd", "gtoadc", "gtodca", "gtodac", "gdcato", "gdcaot", "gdctao", "gdctoa", "gdcoat", "gdcota", "gdacto", "gdacot", "gdatco", "gdatoc", "gdaoct", "gdaotc", "gdtcao", "gdtcoa", "gdtaco", "gdtaoc", "gdtoca", "gdtoac", "gdocat", "gdocta", "gdoact", "gdoatc", "gdotca", "gdotac", "gocatd", "gocadt", "goctad", "goctda", "gocdat", "gocdta", "goactd", "goacdt", "goatcd", "goatdc", "goadct", "goadtc", "gotcad", "gotcda", "gotacd", "gotadc", "gotdca", "gotdac", "godcat", "godcta", "godact", "godatc", "godtca", "godtac"]))

    }
}
