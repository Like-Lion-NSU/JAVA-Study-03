package Likelion;
import java.util.*;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 50000) {
            System.out.printf("오만원권 : " + a / 50000 + "장", a);
            if ((a % 50000) >= 10000) {
                System.out.printf("\n만원권 : " + a % 50000 / 10000 + "장", a);
                if ((a % 50000 % 10000) >= 1000) {
                    System.out.printf("\n천원권 : " + a % 50000 % 10000 / 1000 + "장", a);
                    if ((a % 50000 % 10000 % 1000) >= 100) {
                        System.out.printf("\n백원 : " + a % 50000 % 10000 % 1000 / 100 + "개", a);
                        if ((a % 50000 % 10000 % 1000 % 100) >= 50) {
                            System.out.printf("\n오십원 : " + a % 50000 % 10000 % 1000 % 100 / 50 + "개", a);
                            if ((a % 50000 % 10000 % 1000 % 100 % 50) >= 10) {
                                System.out.printf("\n십원 : " + a % 50000 % 10000 % 1000 % 100 % 50 / 10 + "개", a);
                                if ((a % 50000 % 10000 % 1000 % 100 % 50 % 10) >= 1) {
                                    System.out.printf("\n일원 : " + a % 50000 % 10000 % 1000 % 100 % 50 % 10 / 1 + "개", a);
                                }
                            }
                        }
                    }
                }
            }
        } else if (a >= 10000) {
            System.out.printf("만원권 " + a / 10000 + "장", a);
            if ((a % 10000) >= 1000) {
                System.out.printf("\n천원권 : " + a % 10000 / 1000 + "장", a);
                if ((a % 10000 % 1000) >= 100) {
                    System.out.printf("\n백원 : " + a % 10000 % 1000 / 100 + "개", a);
                    if ((a % 10000 % 1000 % 100) >= 50) {
                        System.out.printf("\n오십원 : " + a % 10000 % 1000 % 100 / 50 + "개", a);
                        if ((a % 10000 % 1000 % 100 % 50) >= 10) {
                            System.out.printf("\n십원 : " + a % 10000 % 1000 % 100 % 50 / 10 + "개", a);
                            if ((a % 10000 % 1000 % 100 % 50 % 10) >= 5) {
                                System.out.printf("\n오원 : " + a % 10000 % 1000 % 100 % 50 % 10 / 5 + "개", a);
                                if ((a % 10000 % 1000 % 100 % 50 % 10 % 5) >= 1) {
                                    System.out.printf("\n일원 : " + a % 10000 % 1000 % 100 % 50 % 10 % 5 / 1 + "개", a);
                                }
                            }
                        }
                    }
                }
            }

        } else if (a >= 1000) {
            System.out.printf("천원권 " + a / 1000 + "장", a);
            if ((a % 1000) >= 100) {
                System.out.printf("\n백원 : " + a % 1000 / 100 + "개", a);
                if ((a % 1000 % 100) >= 50) {
                    System.out.printf("\n오십원 : " + a % 1000 % 100 / 50 + "개", a);
                    if ((a % 1000 % 100 % 50) >= 10) {
                        System.out.printf("\n십원 : " + a % 1000 % 100 % 50 / 10 + "개", a);
                        if ((a % 1000 % 100 % 50 % 10) >= 5) {
                            System.out.printf("\n오원 : " + a % 1000 % 100 % 50 % 10 / 5 + "개", a);
                            if ((a % 1000 % 100 % 50 % 10 % 5) >= 1) {
                                System.out.printf("\n일원 : " + a % 1000 % 100 % 50 % 10 % 5 / 1 + "개", a);
                            }
                        }
                    }
                }
            }
        }else if (a >= 100) {
                            System.out.printf("백원 " + a / 100 + "개", a);
                            if ((a % 100) >= 50) {
                                System.out.printf("\n오십원 : " + a % 100 / 50 + "개", a);
                                if ((a % 100 % 50) >= 10) {
                                    System.out.printf("\n십원 : " + a % 100 % 50 / 10 + "개", a);
                                    if ((a % 100 % 50 % 10) >= 5) {
                                        System.out.printf("\n오원 : " + a % 100 % 50 % 10 / 5 + "개", a);
                                        if ((a % 100 % 50 % 10 % 5) >= 1) {
                                            System.out.printf("\n일원 : " + a % 100 % 50 % 10 % 5 / 1 + "개", a);
                                        }
                                    }
                                }
                            }
                        } else if (a >= 50) {
            System.out.printf("오십원 " + a / 50 + "개", a);
            if ((a % 50) >= 10) {
                System.out.printf("\n십원 : " + a % 50 / 10 + "개", a);
                if ((a % 50 % 10) >= 5) {
                    System.out.printf("\n오원 : " + a % 50 % 10 / 5 + "개", a);
                    if ((a % 50 % 10 % 5) >= 1) {
                        System.out.printf("\n일원 : " + a % 50 % 10 % 5 / 1 + "개", a);
                    }
                }
            }
        } else if (a >= 10) {
            System.out.printf("십원 " + a / 10 + "개", a);
            if ((a % 10) >= 5) {
                System.out.printf("\n오원 : " + a % 10 / 5 + "개", a);
                if ((a % 10 % 5) >= 1) {
                    System.out.printf("\n일원 : " + a % 10 % 5 / 1 + "개", a);
                }
            }
        } else if (a >= 5) {
            System.out.printf("오원 " + a / 5 + "개", a);
            if ((a % 5) >= 1) {
                System.out.printf("\n일원 : " + a % 5 / 1 + "개", a);
            }
        } else {
            System.out.printf("일원 : " + a % 5 / 1 + "개", a);
        }


  }
}
