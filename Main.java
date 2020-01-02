
import java.util.*;
class Main
{
    public static void main(String[] args){
        List<String> prefix = new ArrayList<String>();
        List<String> root = new ArrayList<String>();
        List<String> suffix = new ArrayList<String>();
        String CompaName = "";
        int weaponCount = 1;
        int level = 0;
        int cost = 0;
        int damageA = 0;
        int damageB = 0; 
        int balancing = 0;
        int selection = 0;
        int type = 0;
        int model = 0; 
        int capacity = 0;
        int usage = 1;
        int range = 1;
        int manu = 0;
        String base = "";
        String weap = ""; 
        String manud = "";
        String dmv = "";
        String weapPost = "";
        while(weaponCount<20){
          manu = 0;
          base = ""+weaponCount;
          while(manu<5){
            model = 0;
            switch(manu){
                  case 0: manud = "M";
                    break;
                  case 1: manud = "H";
                    break;
                  case 2: manud = "D";
                    break;
                  case 3: manud = "TOR";
                    break;
                  case 4: manud = "J";
                    break;
                }
                System.out.println(manud);
            while(model<5){
              type = 0;
              if(model == 0){
                  damageB = damageB + 2;
                  capacity = (int )((Math.random() * 4 + 1)) + ((weaponCount/4));
                  range = (10*(weaponCount)*5);
                  if (range>750){
                    range = 750;
                  }
                  weap = "Sniper";
                  weapPost = "S";
                }
                if(model == 1){
                  capacity = (int )((Math.random() * 6 + 1)) + ((weaponCount/2));
                  range = (10*(weaponCount));
                  if (range>50){
                    range = 50;
                  }
                  weap = "Pistol";
                  weapPost = "P";
                }
                if(model == 2){
                  capacity = (int )((Math.random() * 20 + 1)) + ((weaponCount));
                  range = (10*(weaponCount));
                  if (range>50){
                    range = 50;
                  }
                  weap = "Submachine Gun";
                  weapPost = "SUB";
                }
                if(model == 3){
                  capacity = (int )((Math.random() * 10 + 1)) + ((weaponCount/2));
                  weap = "Rifle";
                  weapPost = "R";
                  range = (10*(weaponCount)+50);
                  if (range>200){
                    range = 200;
                  }
                  damageB = damageB + 2;
                }
                if(model == 4){
                  capacity = (int )((Math.random() * 40 + 1)) + (weaponCount);
                  range = (10*(weaponCount)*2);
                  if (range>150){
                    range = 150;
                  }
                  weap = "Heavy";
                  weapPost = "H";
                  damageB = damageB + 4;
                }
                System.out.println(weap);
              while(type<7){
                weap = " ";
                manud = " ";
                dmv = " ";
                switch(base){
                    case "1": level = 1;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (100*level)*balancing;
                              damageA = 1;
                              if(balancing == 1){
                                  damageB = 3;
                              }
                              if(balancing == 2){
                                  damageB = 4;
                              }
                    break;
                    case "2": level = 2;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (100*level)*balancing;
                              damageA = 1;
                              if(balancing == 1){
                                  damageB = 3;
                              }
                              if(balancing == 2){
                                  damageB = 4;
                              }
                    break;
                    case "3": level = 3;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (150*level)*balancing;
                              damageA = 1;
                              if(balancing == 1){
                                  damageB = 4;
                              }
                              if(balancing == 2){
                                  damageB = 6;
                              }
                    break;
                    case "4": level = 4;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (100*level)*balancing;
                              damageA = 1;
                              if(balancing == 1){
                                  damageB = 4;
                              }
                              if(balancing == 2){
                                  damageB = 6;
                              }
                    break;
                    case "5": level = 5;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (200*level)*balancing;
                              damageA = 1;
                              if(balancing == 1){
                                  damageB = 4;
                              }
                              if(balancing == 2){
                                  damageB = 6;
                              }
                    break;
                    case "6": level = 6;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (200*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 4;
                              }
                              if(balancing == 2){
                                  damageB = 6;
                              }
                    break;
                    case "7": level = 7;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (250*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 6;
                              }
                              if(balancing == 2){
                                  damageB = 8;
                              }
                    break;
                    case "8": level = 8;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (250*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 6;
                              }
                              if(balancing == 2){
                                  damageB = 8;
                              }
                    break;
                    case "9": level = 9;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 6;
                              }
                              if(balancing == 2){
                                  damageB = 8;
                              }
                    break;
                    case "10": level = 10;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 6;
                              }
                              if(balancing == 2){
                                  damageB = 8;
                              }
                    break;
                    case "11": level = 11;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 8;
                              }
                              if(balancing == 2){
                                  damageB = 10;
                              }
                    break;
                    case "12": level = 12;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 8;
                              }
                              if(balancing == 2){
                                  damageB = 10;
                              }
                    break;
                    case "13": level = 13;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 8;
                              }
                              if(balancing == 2){
                                  damageB = 10;
                              }
                    break;
                    case "14": level = 14;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 8;
                              }
                              if(balancing == 2){
                                  damageB = 10;
                              }
                    break;
                    case "15": level = 15;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 8;
                              }
                              if(balancing == 2){
                                  damageB = 10;
                              }
                    break;
                    case "16": level = 16;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 10;
                              }
                              if(balancing == 2){
                                  damageB = 12;
                              }
                    break;
                    case "17": level = 17;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 10;
                              }
                              if(balancing == 2){
                                  damageB = 12;
                              }
                    break;
                    case "18": level = 18;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 10;
                              }
                              if(balancing == 2){
                                  damageB = 12;
                              }
                    break;
                    case "19": level = 19;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 10;
                              }
                              if(balancing == 2){
                                  damageB = 12;
                              }
                    break;
                    case "20": level = 20;
                              balancing = (int )(Math.random() * 2 + 1);
                              cost = (300*level)*balancing;
                              damageA = (int )(Math.random() * 2 + 1);
                              if(balancing == 1){
                                  damageB = 10;
                              }
                              if(balancing == 2){
                                  damageB = 12;
                              }
                    break;
                }
                CompaName = manud;
                if(type == 0){
                  dmv = "Acidic";
                  CompaName = CompaName+"AC";
                }
                if(type == 1){
                  dmv = "Shocking";
                  CompaName = CompaName+"SH";
                }
                if(type == 2){
                  dmv = "Flame";
                  CompaName = CompaName+"FL";
                }
                if(type == 3){
                  dmv = "Slag";
                  CompaName = CompaName+"SL";
                }
                if(type == 4){
                  dmv = "Sonic";
                  CompaName = CompaName+"SO";
                }
                if(type == 5){
                  dmv = "Cryo";
                  CompaName = CompaName+"CR";
                }
                if(type == 6){
                  dmv = "Laser";
                  CompaName = CompaName+"LA";
                }
                CompaName = CompaName+"-"+(int )((Math.random() * 15 + 1))+damageA+damageB+weapPost;
                System.out.println(CompaName+" "+"| Damage: "+damageA+"d"+damageB+" "+dmv+"| Cost: "+cost+"|Capacity: "+capacity+(int )((Math.random() * 15 + 1))+"|Usage: "+usage+"|Range: "+range);
                type = type +1;
                prefix.clear();
              }
              model = model+1;
            }
            manu = manu+1;
          }
          weaponCount = weaponCount+1;
      }  
    }
}
