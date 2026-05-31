class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long planetMass=mass;
        for (int i=0;i<asteroids.length;i++){
            if(planetMass>=asteroids [i]){
                planetMass=planetMass+asteroids [i];
            }
            else{
                return false ;
            }
        }
        return true ;
    }
}
