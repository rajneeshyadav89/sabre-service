//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.11 at 01:02:19 PM IST 
//


package com.sabre.webservices.pnrbuilder.v1_19;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeList.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCodeList"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADP"/&gt;
 *     &lt;enumeration value="AED"/&gt;
 *     &lt;enumeration value="AFA"/&gt;
 *     &lt;enumeration value="AFN"/&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="AMD"/&gt;
 *     &lt;enumeration value="ANG"/&gt;
 *     &lt;enumeration value="AOA"/&gt;
 *     &lt;enumeration value="AON"/&gt;
 *     &lt;enumeration value="AOR"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="ATS"/&gt;
 *     &lt;enumeration value="AUD"/&gt;
 *     &lt;enumeration value="AWG"/&gt;
 *     &lt;enumeration value="AZM"/&gt;
 *     &lt;enumeration value="AZN"/&gt;
 *     &lt;enumeration value="BAM"/&gt;
 *     &lt;enumeration value="BBD"/&gt;
 *     &lt;enumeration value="BDT"/&gt;
 *     &lt;enumeration value="BEF"/&gt;
 *     &lt;enumeration value="BGL"/&gt;
 *     &lt;enumeration value="BGN"/&gt;
 *     &lt;enumeration value="BHD"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="BMD"/&gt;
 *     &lt;enumeration value="BND"/&gt;
 *     &lt;enumeration value="BOB"/&gt;
 *     &lt;enumeration value="BOV"/&gt;
 *     &lt;enumeration value="BRL"/&gt;
 *     &lt;enumeration value="BSD"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BWP"/&gt;
 *     &lt;enumeration value="BYR"/&gt;
 *     &lt;enumeration value="BZD"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="CDF"/&gt;
 *     &lt;enumeration value="CHE"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="CHW"/&gt;
 *     &lt;enumeration value="CLF"/&gt;
 *     &lt;enumeration value="CLP"/&gt;
 *     &lt;enumeration value="CNY"/&gt;
 *     &lt;enumeration value="COP"/&gt;
 *     &lt;enumeration value="COU"/&gt;
 *     &lt;enumeration value="CRC"/&gt;
 *     &lt;enumeration value="CUP"/&gt;
 *     &lt;enumeration value="CUC"/&gt;
 *     &lt;enumeration value="CVE"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="DJF"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="DOP"/&gt;
 *     &lt;enumeration value="DZD"/&gt;
 *     &lt;enumeration value="ECS"/&gt;
 *     &lt;enumeration value="ECV"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *     &lt;enumeration value="ERN"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="ETB"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="FIM"/&gt;
 *     &lt;enumeration value="FJD"/&gt;
 *     &lt;enumeration value="FKP"/&gt;
 *     &lt;enumeration value="FRF"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="GEL"/&gt;
 *     &lt;enumeration value="GHC"/&gt;
 *     &lt;enumeration value="GHS"/&gt;
 *     &lt;enumeration value="GIP"/&gt;
 *     &lt;enumeration value="GMD"/&gt;
 *     &lt;enumeration value="GNF"/&gt;
 *     &lt;enumeration value="GRD"/&gt;
 *     &lt;enumeration value="GTQ"/&gt;
 *     &lt;enumeration value="GWP"/&gt;
 *     &lt;enumeration value="GYD"/&gt;
 *     &lt;enumeration value="HKD"/&gt;
 *     &lt;enumeration value="HNL"/&gt;
 *     &lt;enumeration value="HRK"/&gt;
 *     &lt;enumeration value="HTG"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="IDR"/&gt;
 *     &lt;enumeration value="IEP"/&gt;
 *     &lt;enumeration value="ILS"/&gt;
 *     &lt;enumeration value="INR"/&gt;
 *     &lt;enumeration value="IQD"/&gt;
 *     &lt;enumeration value="IRR"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="ITL"/&gt;
 *     &lt;enumeration value="JMD"/&gt;
 *     &lt;enumeration value="JOD"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="KES"/&gt;
 *     &lt;enumeration value="KGS"/&gt;
 *     &lt;enumeration value="KHR"/&gt;
 *     &lt;enumeration value="KMF"/&gt;
 *     &lt;enumeration value="KPW"/&gt;
 *     &lt;enumeration value="KRW"/&gt;
 *     &lt;enumeration value="KWD"/&gt;
 *     &lt;enumeration value="KYD"/&gt;
 *     &lt;enumeration value="KZT"/&gt;
 *     &lt;enumeration value="LAK"/&gt;
 *     &lt;enumeration value="LBP"/&gt;
 *     &lt;enumeration value="LKR"/&gt;
 *     &lt;enumeration value="LRD"/&gt;
 *     &lt;enumeration value="LSL"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="LUF"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LYD"/&gt;
 *     &lt;enumeration value="MAD"/&gt;
 *     &lt;enumeration value="MDL"/&gt;
 *     &lt;enumeration value="MGA"/&gt;
 *     &lt;enumeration value="MGF"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MMK"/&gt;
 *     &lt;enumeration value="MNT"/&gt;
 *     &lt;enumeration value="MOP"/&gt;
 *     &lt;enumeration value="MRO"/&gt;
 *     &lt;enumeration value="MTL"/&gt;
 *     &lt;enumeration value="MUR"/&gt;
 *     &lt;enumeration value="MVR"/&gt;
 *     &lt;enumeration value="MWK"/&gt;
 *     &lt;enumeration value="MXN"/&gt;
 *     &lt;enumeration value="MXV"/&gt;
 *     &lt;enumeration value="MYR"/&gt;
 *     &lt;enumeration value="MZM"/&gt;
 *     &lt;enumeration value="MZN"/&gt;
 *     &lt;enumeration value="NAD"/&gt;
 *     &lt;enumeration value="NGN"/&gt;
 *     &lt;enumeration value="NIO"/&gt;
 *     &lt;enumeration value="NLG"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="NPR"/&gt;
 *     &lt;enumeration value="NZD"/&gt;
 *     &lt;enumeration value="OMR"/&gt;
 *     &lt;enumeration value="PAB"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *     &lt;enumeration value="PGK"/&gt;
 *     &lt;enumeration value="PHP"/&gt;
 *     &lt;enumeration value="PKR"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="PTE"/&gt;
 *     &lt;enumeration value="PYG"/&gt;
 *     &lt;enumeration value="QAR"/&gt;
 *     &lt;enumeration value="ROL"/&gt;
 *     &lt;enumeration value="RON"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *     &lt;enumeration value="RUB"/&gt;
 *     &lt;enumeration value="RUR"/&gt;
 *     &lt;enumeration value="RWF"/&gt;
 *     &lt;enumeration value="SAR"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SCR"/&gt;
 *     &lt;enumeration value="SDD"/&gt;
 *     &lt;enumeration value="SDG"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="SGD"/&gt;
 *     &lt;enumeration value="SHP"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="SKK"/&gt;
 *     &lt;enumeration value="SLL"/&gt;
 *     &lt;enumeration value="SOS"/&gt;
 *     &lt;enumeration value="SRD"/&gt;
 *     &lt;enumeration value="SRG"/&gt;
 *     &lt;enumeration value="SSP"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="STN"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="SYP"/&gt;
 *     &lt;enumeration value="SZL"/&gt;
 *     &lt;enumeration value="THB"/&gt;
 *     &lt;enumeration value="TJR"/&gt;
 *     &lt;enumeration value="TJS"/&gt;
 *     &lt;enumeration value="TMM"/&gt;
 *     &lt;enumeration value="TMT"/&gt;
 *     &lt;enumeration value="TND"/&gt;
 *     &lt;enumeration value="TOP"/&gt;
 *     &lt;enumeration value="TPE"/&gt;
 *     &lt;enumeration value="TRL"/&gt;
 *     &lt;enumeration value="TRY"/&gt;
 *     &lt;enumeration value="TTD"/&gt;
 *     &lt;enumeration value="TWD"/&gt;
 *     &lt;enumeration value="TZS"/&gt;
 *     &lt;enumeration value="UAH"/&gt;
 *     &lt;enumeration value="UGX"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="USN"/&gt;
 *     &lt;enumeration value="USS"/&gt;
 *     &lt;enumeration value="UYI"/&gt;
 *     &lt;enumeration value="UYU"/&gt;
 *     &lt;enumeration value="UZS"/&gt;
 *     &lt;enumeration value="VEB"/&gt;
 *     &lt;enumeration value="VEF"/&gt;
 *     &lt;enumeration value="VND"/&gt;
 *     &lt;enumeration value="VUV"/&gt;
 *     &lt;enumeration value="WST"/&gt;
 *     &lt;enumeration value="XAF"/&gt;
 *     &lt;enumeration value="XAG"/&gt;
 *     &lt;enumeration value="XAU"/&gt;
 *     &lt;enumeration value="XBA"/&gt;
 *     &lt;enumeration value="XBB"/&gt;
 *     &lt;enumeration value="XBC"/&gt;
 *     &lt;enumeration value="XBD"/&gt;
 *     &lt;enumeration value="XCD"/&gt;
 *     &lt;enumeration value="XDR"/&gt;
 *     &lt;enumeration value="XFO"/&gt;
 *     &lt;enumeration value="XFU"/&gt;
 *     &lt;enumeration value="XOF"/&gt;
 *     &lt;enumeration value="XPD"/&gt;
 *     &lt;enumeration value="XPF"/&gt;
 *     &lt;enumeration value="XPT"/&gt;
 *     &lt;enumeration value="XSU"/&gt;
 *     &lt;enumeration value="XTS"/&gt;
 *     &lt;enumeration value="XUA"/&gt;
 *     &lt;enumeration value="XXX"/&gt;
 *     &lt;enumeration value="YER"/&gt;
 *     &lt;enumeration value="YUM"/&gt;
 *     &lt;enumeration value="ZAL"/&gt;
 *     &lt;enumeration value="ZAR"/&gt;
 *     &lt;enumeration value="ZMK"/&gt;
 *     &lt;enumeration value="ZMW"/&gt;
 *     &lt;enumeration value="ZRN"/&gt;
 *     &lt;enumeration value="ZWD"/&gt;
 *     &lt;enumeration value="ZWL"/&gt;
 *     &lt;enumeration value="BYN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCodeList")
@XmlEnum
public enum CurrencyCodeList {


    /**
     * Andorran Peseta: Andorra
     * 
     */
    ADP,

    /**
     * UAE Dirham: United Arab Emirates
     * 
     */
    AED,

    /**
     * Afghani: Afghanistan; replaced in 2003 by AFN
     * 
     */
    AFA,

    /**
     * Afghani: Afghanistan;
     * 
     */
    AFN,

    /**
     * Lek: Albania
     * 
     */
    ALL,

    /**
     * Armenian Dram: Armenia
     * 
     */
    AMD,

    /**
     * Antillian Guilder: Netherlands Antilles
     * 
     */
    ANG,

    /**
     * Angolan Kwanza: Angola
     * 
     */
    AOA,

    /**
     * New Kwanza: Angola; used until 1995, now AOA
     * 
     */
    AON,

    /**
     * Kwanza Reajustado: Angola; used until 1995, now AON
     * 
     */
    AOR,

    /**
     * Argentine Peso: Argentina
     * 
     */
    ARS,

    /**
     * Schilling: Austria; replaced by Euro in 2002
     * 
     */
    ATS,

    /**
     * Australian Dollar: Australia, Christmas Island, Cocos (Keeling) Islands, Heard
     *                         and Mcdonald Islands, Kiribati, Nauru, Norfolk Island, Tuvalu
     *                     
     * 
     */
    AUD,

    /**
     * Aruban Guilder: Aruba
     * 
     */
    AWG,

    /**
     * Azerbaijanian Manat: Azerbaijan; replaced by AZN in 2006
     * 
     */
    AZM,

    /**
     * Azerbaijani Manat: Azerbaijan
     * 
     */
    AZN,

    /**
     * Convertible Marks: Bosnia and Herzegovina
     * 
     */
    BAM,

    /**
     * Barbados Dollar: Barbados
     * 
     */
    BBD,

    /**
     * Taka: Bangladesh
     * 
     */
    BDT,

    /**
     * Belgian Franc: Belgium; replaced by Euro in 2002
     * 
     */
    BEF,

    /**
     * Lev: Bulgaria; replaced by BGN in 1999
     * 
     */
    BGL,

    /**
     * Bulgarian LEV: Bulgaria
     * 
     */
    BGN,

    /**
     * Bahraini Dinar: Bahrain
     * 
     */
    BHD,

    /**
     * Burundi Franc: Burundi
     * 
     */
    BIF,

    /**
     * Bermudian Dollar: Bermuda
     * 
     */
    BMD,

    /**
     * Brunei Dollar: Brunei Darussalam
     * 
     */
    BND,

    /**
     * Bolivian Boliviano: Bolivia
     * 
     */
    BOB,

    /**
     * Bolivian MVDOL: Bolivia (not in circulation)
     * 
     */
    BOV,

    /**
     * Brazilian Real: Brazil
     * 
     */
    BRL,

    /**
     * Bahamian Dollar: Bahamas
     * 
     */
    BSD,

    /**
     * Ngultrum: Bhutan
     * 
     */
    BTN,

    /**
     * Pula: Botswana
     * 
     */
    BWP,

    /**
     * Belarussian Ruble: Belarus
     * 
     */
    BYR,

    /**
     * Belize Dollar: Belize
     * 
     */
    BZD,

    /**
     * Canadian Dollar: Canada
     * 
     */
    CAD,

    /**
     * Franc Congolais: Congo, The Democratic Republic Of
     * 
     */
    CDF,

    /**
     * WIR Euro(complementary currency): Switzerland
     * 
     */
    CHE,

    /**
     * Swiss Franc: Liechtenstein, Switzerland
     * 
     */
    CHF,

    /**
     * WIR Franc (complementary currency): Switzerland
     * 
     */
    CHW,

    /**
     * Unidades de fomento: Chile
     * 
     */
    CLF,

    /**
     * Chilean Peso: Chile
     * 
     */
    CLP,

    /**
     * Yuan Renminbi: China
     * 
     */
    CNY,

    /**
     * Colombian Peso: Colombia
     * 
     */
    COP,

    /**
     * Unidad de Valor Real: Colombia
     * 
     */
    COU,

    /**
     * Costa Rican Colon: Costa Rica
     * 
     */
    CRC,

    /**
     * Cuban Peso: Cuba
     * 
     */
    CUP,

    /**
     * Cuban Convertible Peso: Cuba
     * 
     */
    CUC,

    /**
     * Cape Verde Escudo: Cape Verde
     * 
     */
    CVE,

    /**
     * Cyprus Pound: Cyprus; replaced by Euro in 2007
     * 
     */
    CYP,

    /**
     * Czech Koruna: Czech Republic
     * 
     */
    CZK,

    /**
     * Deutsche Mark: Germany; replaced by Euro in 2002
     * 
     */
    DEM,

    /**
     * Djibouti Franc: Djibouti
     * 
     */
    DJF,

    /**
     * Danish Krone: Denmark, Faeroe Islands, Greenland
     * 
     */
    DKK,

    /**
     * Dominican Peso: Dominican Republic
     * 
     */
    DOP,

    /**
     * Algerian Dinar: Algeria
     * 
     */
    DZD,

    /**
     * Sucre: Ecuador; ; replaced by US Dollar in 2000
     * 
     */
    ECS,

    /**
     * Unidad de Valor Constante (UVC): Ecuador; not used since 2000
     * 
     */
    ECV,

    /**
     * Kroon: Estonia; replaced by Euro in 2011
     * 
     */
    EEK,

    /**
     * Egyptian Pound: Egypt
     * 
     */
    EGP,

    /**
     * Nakfa: Eritrea
     * 
     */
    ERN,

    /**
     * Spanish Peseta: Andorra, Spain; replaced by Euro in 2002
     * 
     */
    ESP,

    /**
     * Ethiopian Birr: Ethiopia
     * 
     */
    ETB,

    /**
     * Euro:
     * 
     */
    EUR,

    /**
     * Markka: Finland; replaced by Euro in 2002
     * 
     */
    FIM,

    /**
     * Fiji Dollar: Fiji
     * 
     */
    FJD,

    /**
     * Pound: Falkland Islands (Malvinas)
     * 
     */
    FKP,

    /**
     * French Franc: Andorra, France, French Guiana, French Southern Territories,
     *                         Guadeloupe, Martinique, Monaco, Reunion, St Pierre and Miquelon; replaced by Euro in 1999
     *                     
     * 
     */
    FRF,

    /**
     * Pound Sterling: United Kingdom
     * 
     */
    GBP,

    /**
     * Lari: Georgia
     * 
     */
    GEL,

    /**
     * Cedi: Ghana; replaced in 2007 by Ghanaian New Cedi GHS
     * 
     */
    GHC,

    /**
     * Cedi: Ghana
     * 
     */
    GHS,

    /**
     * Gibraltar Pound: Gibraltar
     * 
     */
    GIP,

    /**
     * Dalasi: Gambia
     * 
     */
    GMD,

    /**
     * Guinea Franc: Guinea
     * 
     */
    GNF,

    /**
     * Drachma: Greece; replaced by Euro in 2002
     * 
     */
    GRD,

    /**
     * Quetzal: Guatemala
     * 
     */
    GTQ,

    /**
     * Guinea-Bissau Peso: Guinea-Bissau; replaced by CFA franc in 1997
     *                     
     * 
     */
    GWP,

    /**
     * Guyana Dollar: Guyana
     * 
     */
    GYD,

    /**
     * Hong Kong Dollar: Hong Kong
     * 
     */
    HKD,

    /**
     * Lempira: Honduras
     * 
     */
    HNL,

    /**
     * Kuna: Croatia
     * 
     */
    HRK,

    /**
     * Gourde: Haiti
     * 
     */
    HTG,

    /**
     * Forint: Hungary
     * 
     */
    HUF,

    /**
     * Rupiah: East Timor, Indonesia
     * 
     */
    IDR,

    /**
     * Irish Pound: Ireland; replaced by Euro in 2009
     * 
     */
    IEP,

    /**
     * New Israeli Sheqel: Israel
     * 
     */
    ILS,

    /**
     * Indian Rupee: Bhutan, India
     * 
     */
    INR,

    /**
     * Iraqi Dinar: Iraq
     * 
     */
    IQD,

    /**
     * Iranian Rial: Iran (Islamic Republic Of)
     * 
     */
    IRR,

    /**
     * Iceland Krona: Iceland
     * 
     */
    ISK,

    /**
     * Italian Lira: Italy, San Marino, Vatican City State (Holy See); replaced by Euro
     *                         in 1999
     *                     
     * 
     */
    ITL,

    /**
     * Jamaican Dollar: Jamaica
     * 
     */
    JMD,

    /**
     * Jordanian Dinar: Jordan
     * 
     */
    JOD,

    /**
     * Yen: Japan
     * 
     */
    JPY,

    /**
     * Kenyan Shilling: Kenya
     * 
     */
    KES,

    /**
     * Som: Kyrgyzstan
     * 
     */
    KGS,

    /**
     * Riel: Cambodia
     * 
     */
    KHR,

    /**
     * Comoro Franc: Comoros
     * 
     */
    KMF,

    /**
     * North Korean Won: Korea, Democratic People's Republic Of
     * 
     */
    KPW,

    /**
     * Won: Korea, Republic Of
     * 
     */
    KRW,

    /**
     * Kuwaiti Dinar: Kuwait
     * 
     */
    KWD,

    /**
     * Cayman Islands Dollar: Cayman Islands
     * 
     */
    KYD,

    /**
     * Tenge: Kazakhstan
     * 
     */
    KZT,

    /**
     * Kip: Lao People's Democratic Republic
     * 
     */
    LAK,

    /**
     * Lebanese Pound: Lebanon
     * 
     */
    LBP,

    /**
     * Sri Lanka Rupee: Sri Lanka
     * 
     */
    LKR,

    /**
     * Liberian Dollar: Liberia
     * 
     */
    LRD,

    /**
     * Loti: Lesotho
     * 
     */
    LSL,

    /**
     * Lithuanian Litas: Lithuania; replaced by Euro in 2015
     * 
     */
    LTL,

    /**
     * Luxembourg Franc: Luxembourg; replaced by Euro in 2002
     * 
     */
    LUF,

    /**
     * Latvian Lats: Latvia; replaced by Euro in 2014
     * 
     */
    LVL,

    /**
     * Libyan Dinar: Libyan Arab Jamahiriya
     * 
     */
    LYD,

    /**
     * Moroccan Dirham: Morocco, Western Sahara
     * 
     */
    MAD,

    /**
     * Moldovan Leu: Moldova, Republic Of
     * 
     */
    MDL,

    /**
     * Malagasy Ariary: Madagascar
     * 
     */
    MGA,

    /**
     * Malagasy Franc: Madagascar; replaced by Ariary in 2005
     * 
     */
    MGF,

    /**
     * Denar: Macedonia, The Former Yugoslav Republic Of
     * 
     */
    MKD,

    /**
     * Kyat: Myanmar
     * 
     */
    MMK,

    /**
     * Tugrik: Mongolia
     * 
     */
    MNT,

    /**
     * Pataca: Macau
     * 
     */
    MOP,

    /**
     * Ouguiya: Mauritania
     * 
     */
    MRO,

    /**
     * Maltese Lira: Malta; replaced by Euro in 2008
     * 
     */
    MTL,

    /**
     * Mauritius Rupee: Mauritius
     * 
     */
    MUR,

    /**
     * Rufiyaa: Maldives
     * 
     */
    MVR,

    /**
     * Kwacha: Malawi
     * 
     */
    MWK,

    /**
     * Mexican Peso: Mexico
     * 
     */
    MXN,

    /**
     * Mexican Unidad de Inversion (UDI): Mexico
     * 
     */
    MXV,

    /**
     * Malaysian Ringgit: Malaysia
     * 
     */
    MYR,

    /**
     * Metical: Mozambique; replaced by MZN in 2012
     * 
     */
    MZM,

    /**
     * Metical: Mozambique
     * 
     */
    MZN,

    /**
     * Namibia Dollar: Namibia
     * 
     */
    NAD,

    /**
     * Naira: Nigeria
     * 
     */
    NGN,

    /**
     * Cordoba Oro: Nicaragua
     * 
     */
    NIO,

    /**
     * Netherlands Guilder: Netherlands; replaced by Euro in 2002
     * 
     */
    NLG,

    /**
     * Norwegian Krone: Bouvet Island, Norway, Svalbard and Jan Mayen Islands
     *                     
     * 
     */
    NOK,

    /**
     * Nepalese Rupee: Nepal
     * 
     */
    NPR,

    /**
     * New Zealand Dollar: Cook Islands, New Zealand, Niue, Pitcairn, Tokelau
     *                     
     * 
     */
    NZD,

    /**
     * Rial Omani: Oman
     * 
     */
    OMR,

    /**
     * Balboa: Panama
     * 
     */
    PAB,

    /**
     * Nuevo Sol: Peru
     * 
     */
    PEN,

    /**
     * Kina: Papua New Guinea
     * 
     */
    PGK,

    /**
     * Philippine Peso: Philippines
     * 
     */
    PHP,

    /**
     * Pakistan Rupee: Pakistan
     * 
     */
    PKR,

    /**
     * Zloty: Poland
     * 
     */
    PLN,

    /**
     * Portuguese Escudo: Portugal; replaced by Euro in 2002
     * 
     */
    PTE,

    /**
     * Guarani: Paraguay
     * 
     */
    PYG,

    /**
     * Qatari Rial: Qatar
     * 
     */
    QAR,

    /**
     * Leu: Romania; replaced by RON in 2005
     * 
     */
    ROL,

    /**
     * Leu: Romania
     * 
     */
    RON,

    /**
     * Serbian Dinar: Serbia
     * 
     */
    RSD,

    /**
     * Russian Ruble: Russian Federation
     * 
     */
    RUB,

    /**
     * Russian Ruble: Russian Federation; replaced by RUB in 1998, but the code is still
     *                         in use
     *                     
     * 
     */
    RUR,

    /**
     * Rwanda Franc: Rwanda
     * 
     */
    RWF,

    /**
     * Saudi Riyal: Saudi Arabia
     * 
     */
    SAR,

    /**
     * Solomon Islands Dollar: Solomon Islands
     * 
     */
    SBD,

    /**
     * Seychelles Rupee: Seychelles
     * 
     */
    SCR,

    /**
     * Sudanese Dinar: Sudan; replased by Sudanese Pound (SDG) in 2007
     *                     
     * 
     */
    SDD,

    /**
     * Sudanese Pound: Sudan
     * 
     */
    SDG,

    /**
     * Swedish Krona: Sweden
     * 
     */
    SEK,

    /**
     * Singapore Dollar: Singapore
     * 
     */
    SGD,

    /**
     * St Helena Pound: St Helena
     * 
     */
    SHP,

    /**
     * Tolar: Slovenia; replaced by Euro in 2007
     * 
     */
    SIT,

    /**
     * Slovak Koruna: Slovakia; replaced by Euro in 2009
     * 
     */
    SKK,

    /**
     * Leone: Sierra Leone
     * 
     */
    SLL,

    /**
     * Somali Shilling: Somalia
     * 
     */
    SOS,

    /**
     * Surinam Dollar: Suriname
     * 
     */
    SRD,

    /**
     * Surinam Guilder: Suriname; replaced by Suriname Guilder in 2004
     *                     
     * 
     */
    SRG,

    /**
     * South Sudanese Pound; South Sudan
     * 
     */
    SSP,

    /**
     * Dobra: Sao Tome and Principe (before 12/01/17)
     * 
     */
    STD,

    /**
     * Dobra: Sao Tome and Principe (after 12/01/17)
     * 
     */
    STN,

    /**
     * El Salvador Colon: El Salvador
     * 
     */
    SVC,

    /**
     * Syrian Pound: Syrian Arab Republic
     * 
     */
    SYP,

    /**
     * Lilangeni: Swaziland
     * 
     */
    SZL,

    /**
     * Baht: Thailand
     * 
     */
    THB,

    /**
     * Tajik Ruble (old): Tajikistan (Old); replaced by Somoni (TJS) in 2000
     *                     
     * 
     */
    TJR,

    /**
     * Somoni: Tajikistan
     * 
     */
    TJS,

    /**
     * Manat: Turkmenistan; replaced by TMT in 2009
     * 
     */
    TMM,

    /**
     * Manat: Turkmenistan
     * 
     */
    TMT,

    /**
     * Tunisian Dinar: Tunisia
     * 
     */
    TND,

    /**
     * Pa'anga: Tonga
     * 
     */
    TOP,

    /**
     * Timor Escudo: East Timor; replaced by USD
     * 
     */
    TPE,

    /**
     * Turkish Lira: Turkey; replaced by TRY in 2005
     * 
     */
    TRL,

    /**
     * Turkish Lira: Turkey
     * 
     */
    TRY,

    /**
     * Trinidad and Tobago Dollar: Trinidad and Tobago
     * 
     */
    TTD,

    /**
     * New Taiwan Dollar: Taiwan, Province Of China
     * 
     */
    TWD,

    /**
     * Tanzanian Shilling: Tanzania, United Republic Of
     * 
     */
    TZS,

    /**
     * Hryvnia: Ukraine
     * 
     */
    UAH,

    /**
     * Uganda Shilling: Uganda
     * 
     */
    UGX,

    /**
     * US Dollar: American Samoa, British Indian Ocean Territory,, Guam, Haiti, Marshall
     *                         Islands, Micronesia, Northern Mariana Islands, Palau, Panama, Puerto Rico, Turks and Caicos
     *                         Islands, United States, United States Minor Outlaying Islands, Virgin Islands (British), Virgin
     *                         Islands (U.S.)
     *                     
     * 
     */
    USD,

    /**
     * (Next day): United States
     * 
     */
    USN,

    /**
     * (Same day): United States
     * 
     */
    USS,

    /**
     * Uruguay Peso en Unidades Indexadas (URUIURUI) (funds code): Uruguay
     *                     
     * 
     */
    UYI,

    /**
     * Peso Uruguayo: Uruguay
     * 
     */
    UYU,

    /**
     * Uzbekistan Sum: Uzbekistan
     * 
     */
    UZS,

    /**
     * Bolivar: Venezuela
     * 
     */
    VEB,

    /**
     * Bolivar: Venezuela
     * 
     */
    VEF,

    /**
     * Dong: Vietnam
     * 
     */
    VND,

    /**
     * Vatu: Vanuatu
     * 
     */
    VUV,

    /**
     * Tala: Samoa
     * 
     */
    WST,

    /**
     * CFA Franc BEAC: Cameroon, Central African Republic, Chad, Congo, Equatorial
     *                         Guinea, Gabon
     *                     
     * 
     */
    XAF,

    /**
     * Silver: Bond Markets Units
     * 
     */
    XAG,

    /**
     * Gold Bond Markets Units:
     * 
     */
    XAU,

    /**
     * European Composite Unit (EURCO): Bond Markets Units
     * 
     */
    XBA,

    /**
     * European Monetary Unit (E.M.U.-6): Bond Markets Units
     * 
     */
    XBB,

    /**
     * European Unit of Account 9 (E.U.A.- 9): Bond Markets Units
     * 
     */
    XBC,

    /**
     * European Unit of Account 17 (E.U.A.- 17): Bond Markets Units
     * 
     */
    XBD,

    /**
     * East Caribbean Dollar: Anguilla, Antigua and Barbuda, Dominica, Grenada,
     *                         Montserrat, St Kitts - Nevis, Saint Lucia, Saint Vincent and The Grenadines
     *                     
     * 
     */
    XCD,

    /**
     * SDR: International Monetary Fund (Imf)
     * 
     */
    XDR,

    /**
     * Gold-Franc: Special settlement currencies; replaced by Special Drawing Rights
     *                         (XDR) in 2003
     *                     
     * 
     */
    XFO,

    /**
     * UIC-Franc: Special settlement currencies; replaced by EURO in 2013
     *                     
     * 
     */
    XFU,

    /**
     * CFA Franc BCEAO: Benin, Burkina Faso, Cote D'ivoire, Guinea-Bissau, Mali, Niger,
     *                         Senegal, Togo
     *                     
     * 
     */
    XOF,

    /**
     * Palladium: Bond Markets Units
     * 
     */
    XPD,

    /**
     * CFP Franc: French Polynesia, New Caledonia, Wallis and Futuna Islands
     *                     
     * 
     */
    XPF,

    /**
     * Platinum: Bond Markets Units
     * 
     */
    XPT,

    /**
     * SUCRE: Unified System for Regional Compensation (SUCRE)[
     * 
     */
    XSU,

    /**
     * Codes specifically reserved for testing purposes:
     * 
     */
    XTS,

    /**
     * ADB Unit of Account: African Development Bank[
     * 
     */
    XUA,

    /**
     * The codes assigned for transactions where no currency is involved are::
     *                     
     * 
     */
    XXX,

    /**
     * Yemeni Rial: Yemen
     * 
     */
    YER,

    /**
     * New Dinar: Yugoslavia;
     * 
     */
    YUM,

    /**
     * (financial Rand): Lesotho; not used since 1995ZM
     * 
     */
    ZAL,

    /**
     * Rand: Lesotho, Namibia, South Africa
     * 
     */
    ZAR,

    /**
     * Kwacha: Zambia; replaced by ZMW in 2012
     * 
     */
    ZMK,

    /**
     * Kwacha: Zambia
     * 
     */
    ZMW,

    /**
     * New Zaire: Zaire; replaced by Congolese Franc in 1998
     * 
     */
    ZRN,

    /**
     * Zimbabwe Dollar: Zimbabwe; replaced by Zimbabwean Dollar in 2009
     *                     
     * 
     */
    ZWD,

    /**
     * Zimbabwean Dollar: Zimbabwe
     * 
     */
    ZWL,

    /**
     * Belarusian Ruble: Belarus
     * 
     */
    BYN;

    public String value() {
        return name();
    }

    public static CurrencyCodeList fromValue(String v) {
        return valueOf(v);
    }

}