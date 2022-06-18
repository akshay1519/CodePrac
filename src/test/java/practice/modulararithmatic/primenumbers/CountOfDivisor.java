package practice.modulararithmatic.primenumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfDivisor {
    public static void main(String[] args) {
        ArrayList<Integer> spf = new ArrayList<Integer>();
        int max = (int) Math.pow(10,6)+1;
        for (int j=0;j<=max;j++){
            spf.add(j);
        }
        for (int j=2;j*j<=max;j++){
            if (spf.get(j)==j){
                for (int k = j*j;k<=max;k+=j){
                    spf.set(k,Math.min(j,spf.get(k)));
                }
            }
        }
        List<Integer> A = Arrays.asList(6270, 7748, 6583, 5157, 6575, 6919, 6953, 7637, 5777, 6424, 7606, 5189, 5843, 7129, 7111, 5606, 5885, 7154, 6459, 7718, 5490, 5118, 5935, 6983, 6466, 5014, 5284, 6227, 6746, 5577, 6896, 7960, 7603, 7901, 6969, 6858, 5228, 7094, 6889, 6814, 5065, 5160, 6243, 5456, 6098, 7730, 5087, 5391, 6607, 5085, 6220, 5317, 7651, 6867, 6330, 6918, 5740, 6021, 6997, 5842, 5904, 7973, 6529, 5225, 6459, 6636, 6697, 7053, 7486, 6686, 5371, 6252, 7059, 5618, 5065, 6707, 5883, 6379, 5282, 6376, 5015, 7833, 6493, 6454, 5859, 5104, 7412, 5952, 7587, 6707, 5089, 5259, 7603, 6563, 7141, 5115, 6575, 6390, 7184, 7059, 6908, 6508, 7346, 7715, 5446, 6943, 6351, 7360, 5452, 5734, 5423, 5946, 7725, 5597, 6869, 5252, 7982, 5557, 6817, 6046, 5344, 7868, 6194, 7043, 7952, 5425, 7546, 6108, 6416, 7019, 6853, 6478, 5944, 5080, 5980, 5891, 7557, 5201, 5851, 5275, 6909, 5408, 5863, 6191, 5747, 6248, 6486, 6425, 6051, 5889, 6308, 7121, 7384, 6938, 5170, 6468, 6908, 6292, 5299, 6387, 7961, 5228, 5653, 7734, 7932, 6029, 7909, 5404, 6571, 5756, 5744, 6230, 5642, 7304, 7247, 7845, 6157, 6623, 7421, 7678, 6146, 7973, 5884, 7942, 5191, 6236, 5940, 7871, 7589, 6757, 5243, 5661, 5226, 6753, 7325, 6358, 6846, 5230, 5207, 5569, 5493, 6381, 7337, 6144, 6515, 6698, 5934, 7983, 7489, 6584, 6826, 6879, 5012, 6912, 7634, 7747, 5217, 6954, 7059, 5746, 7335, 5239, 7799, 7734, 6553, 6283, 7407, 6031, 7796, 5709, 5131, 6896, 5869, 5119, 7516, 7054, 7797, 5077, 5169, 7465, 5894, 5822, 7823, 6967, 6436, 7818, 5349, 5632, 7468, 6896, 6045, 5605, 7519, 6690, 7014, 5820, 6634, 7148, 6010, 7368, 6277, 6290, 6599, 6349, 6250, 5912, 7952, 6839, 6855, 5723, 6004, 7130, 5050, 7408, 7139, 6618, 5370, 7325, 7881, 6685, 5846, 7976, 7458, 6568, 6110, 5054, 7359, 7619, 7292, 5737, 6326, 6459, 7169, 5989, 7422, 5355, 7414, 6953, 7048, 7702, 6588, 7047, 7965, 7741, 5812, 7100, 7496, 6657, 5808, 5869, 6249, 7860, 7246, 6451, 7723, 5719, 5984, 5481, 5272, 7131, 6014, 6689, 7895, 6153, 5482, 6165, 6290, 6557, 6331, 7813, 7648, 7385, 7614, 5675, 7477, 7680, 5616, 7392, 6755, 5220, 6406, 5708, 7498, 5613, 6394, 7920, 7711, 6208, 5984, 5282, 7461, 5228, 6229, 5808, 6617, 7104, 6863, 7419, 5506, 5322, 5885, 5301, 7480, 6154, 7204, 6282, 6034, 7387, 7643, 5324, 5799, 5670, 7857, 6694, 6309, 7290, 6446, 7057, 5062, 5097, 7734, 5643, 7937, 6972, 7339, 6753, 7522, 5547, 6835, 7233, 5469, 6001, 7337, 5083, 5368, 5520, 7974, 5178, 7122, 5563, 6710, 5030, 5180, 7258, 6016, 5792, 5355, 7247, 7325, 7111, 5269, 5964, 5195, 6081, 7821, 7686, 7498, 5462, 5278, 6851, 6802, 7378, 5905, 5930, 6544, 7049, 5176, 7716, 6314, 7644, 7883, 5109, 5941, 7045, 5504, 5533, 6777, 6363, 6413, 5740, 6814, 7141, 6498, 5252, 7990, 5659, 5886, 6771, 7146, 5330, 7464, 6791, 6800, 7053, 7853, 7194, 5928, 6425, 5517, 6920, 5583, 7011, 6542, 7820, 7163, 7357, 5568, 5512, 5689, 7173, 5217, 7556, 5404, 5008, 6165, 6371, 5444, 7941, 7855, 7278, 7285, 6139, 7572, 6601, 7991, 5790, 7396, 5125, 6196, 7645, 5197, 5235, 6039, 6503, 7578, 6829, 5059, 6212, 7258, 5589, 7340, 7177, 5071, 6392, 5881, 7121, 5271, 7547, 6419, 5703, 6439, 7224, 5511, 5737, 6785, 7751, 6913, 7096, 5148, 7568, 7802, 5959, 6427, 5411, 7530, 5818, 6641, 6806, 6085, 5666, 6180, 6198, 6470, 5032, 7207, 5988, 7674, 5919, 7473, 5422, 7858, 5399, 7145, 6665, 7797, 5466, 6485, 7490, 5482, 7850, 7485, 6881, 7167, 5812, 6767, 7323, 6923, 6464, 6227, 5899, 6109, 7894, 7057, 7226, 5855, 5379, 7889, 6011, 7940, 6123, 6910, 5410, 6103, 7363, 6814, 6513, 5014, 7342, 7518, 7137, 6739, 6454, 7527, 6695, 5649, 6946, 6831, 5193, 5302, 5840, 5095, 5426, 7833, 5233, 6861, 6177, 7928, 7858, 5276, 6684, 6416, 6719, 6784, 5789, 5959, 7770, 5917, 5106, 7227, 5980, 7208, 6110, 5348, 5729, 5874, 7421, 7262, 6276, 6740, 6571, 6896, 7078, 6443, 5324, 5933, 6998, 5711, 6086, 7146, 5881, 7034, 5168, 5007, 7703, 5685, 6558, 6502, 7351, 6605, 7528, 6707, 5278, 6124, 5724, 5848, 7564, 5090, 7505, 5136, 6502, 6324, 7056, 6766, 5622, 5821, 6341, 5978, 7026, 6506, 6181, 7127, 7160, 5680, 7697, 5127, 5570, 5672, 7037, 5639, 5848, 5499, 5676, 7727, 5843, 6595, 7724, 5648, 5308, 7934, 5437, 7745, 7477, 6073, 7773, 6246, 6566, 6811, 6980, 5073, 5986, 6318, 5293, 5511, 6972, 5708, 6456, 5797, 7559, 6093, 7212, 5426, 6229, 5244, 7084, 6082, 5169, 5970, 7571, 5779, 6926, 7342, 5506, 5865, 7321, 5840, 6599, 5125, 6738, 7441, 7193, 6276, 7432, 6530, 6027, 6596, 7190, 6435, 5214, 5482, 7641, 7167, 6844, 6122, 7642, 5797, 7484, 5375, 7566, 5639, 6485, 7395, 7888, 7165, 6308, 6299, 7290, 7293, 5138, 6589, 7534, 5359, 6829, 6742, 5599, 5727, 7665, 7700, 6046, 6615, 6708, 7689, 5258, 5311, 5314, 7006, 5126, 5478, 6136, 7045, 7840, 5792, 6232, 6013, 6821, 7650, 5001, 6342, 5390, 5116, 7451, 7900, 7507, 6756, 7822, 7637, 6971, 5334, 5838, 7294, 6662, 6796, 6772, 6305, 6824, 7217, 5225, 7936, 5079, 5761, 6890, 7146, 5719, 6938, 7661, 7526, 6908, 6672, 5316, 7999, 5745, 5964, 7519, 6837, 7695, 6029, 5142, 6787, 7570, 7009, 7935, 7875, 5316, 6428, 7219, 7694, 6951, 5675, 7753, 5658, 5455, 7828, 5006, 5880, 6039, 6165, 6988, 5938, 6029, 7723, 5308, 5952, 7713, 6162, 7485, 5884, 5712, 5212, 5485, 7089, 7018, 7778, 7263, 7584, 7469, 7723, 5475, 5536, 6456, 7160, 5745, 5878, 6737, 6854, 7728, 5875, 7662, 6161, 7844, 6874, 5668, 7635, 6869, 6279, 7748, 6160, 6618, 5164, 5583, 7141, 7719, 7662, 5341, 7927, 5968, 7586, 5534, 5259, 5960, 7424, 7090, 6146, 7575, 6058, 5634, 5063, 7595, 5218, 5160, 6973, 7052, 6820, 5550, 6074, 7979, 6923, 5021, 7731, 6043, 5125, 7324, 6374, 5074, 7754, 6520, 7642, 5692, 5193, 5402, 6346, 5218, 5203, 7035, 5194, 7738, 5990, 7553, 7520, 7519, 6232, 6249, 7523, 5176, 6130, 5047, 6769, 7717, 5904, 7790, 5927, 5216, 6978, 6280, 7865, 6099, 5396, 7793, 7401, 7987, 5737, 5711, 7128, 7803, 6065, 6146, 5775, 6206, 7102, 6801, 6673, 7601, 7009, 7958, 7874, 5799, 7771, 5320, 7494, 6016, 7295, 7503, 5782, 5150, 7885, 5210, 7384, 5338, 5810, 7714, 6107, 6478, 5193, 7871, 5442, 6902, 7391, 5940, 5845, 7527, 6521, 6548, 6655, 7698, 5687, 6561, 6245, 6567, 7821, 6221, 5802, 7171, 6934, 7679, 6760, 6390, 5889, 6125, 5687, 5791, 6561, 5951, 5983, 6779, 6555, 5833, 5430, 7731, 5341, 7337, 7178, 5673, 6884, 6537, 6326, 7745, 5486, 5263, 5775, 5976, 7718, 6934, 5512, 6093, 5892, 5511, 5959, 7736, 5610, 5864, 5439, 6096, 7465, 6846, 6211, 5153, 6959, 6618, 7895, 6652, 7205, 6151, 5435, 5646, 5899, 6544, 7073, 5823, 5481, 7617, 7035, 7911, 6265, 7379, 5939, 5322, 6694, 7247, 5064, 5723, 6675, 7440, 5883, 6483, 6242, 5713, 6320, 6927, 6557, 6581, 7408, 7066, 5484, 7334, 8000, 6821, 7659, 7585, 6349, 5981, 7139, 5710, 7297, 5928, 7372, 7357, 6876, 5775, 7286, 5291, 6050, 6848, 7907, 5115, 7260, 6460, 6922, 5894, 7328, 6652, 6141, 7443, 5168, 6037, 6744, 6963, 7550, 5053, 7699, 7881, 6977, 5802, 6593, 5091, 6544, 7304, 7556, 6447, 5330, 7262, 7748, 7080, 7630, 7538, 6257, 6244, 6981, 6264, 5002, 6563, 7627, 5019, 5519, 6052, 7616, 5682, 7203, 7988, 7387, 7527, 5811, 5563, 6189, 5724, 5678, 5449, 5240, 6812, 5194, 7653, 5008, 6734, 5769, 7693, 5460, 7880, 5499, 5853, 5551, 6053, 6351, 6279, 5627, 5523, 5637, 5918, 7778, 7294, 5070, 6712, 5510, 6353, 7609, 5137, 6427, 7108, 5709, 6039, 5842, 6268, 7521, 6802, 5544, 6297, 7860, 5224, 5094, 5099, 7661, 6977, 7236, 5846, 7860, 7292, 6148, 5873, 5451, 5474, 6391, 6227, 7651, 7044, 6451, 6925, 5829, 6690, 5885, 5059, 5008, 5865, 6062, 7816, 5371, 6694, 7488, 6968, 5321, 7894, 5681, 5781, 5208, 5744, 6482, 6227, 5854, 5591, 6552, 5156, 5555, 5108, 6751, 5534, 6175, 5485, 6841, 6013, 7405, 7850, 7809, 5996, 6192, 7608, 7887, 7966, 5691, 7995, 6032, 6175, 7967, 5916, 5419, 5847, 6989, 7213, 5092, 6778, 5245, 5716, 7638, 5751, 6555, 5928, 7325, 6339, 5399, 6868, 5743, 6623, 7268, 6498, 6537, 6968, 6194, 7301, 6336, 7380, 7776, 6886, 6506, 5022, 6581, 7116, 7759, 7281, 7913, 5953, 6144, 5283, 5436, 6303, 7280, 6993, 5188, 6288, 7105, 7976, 5946, 7849, 6734, 6587, 7916, 7230, 7302, 5726, 5050, 5761, 5987, 6418, 7276, 5464, 7598, 7293, 5146, 7294, 7353, 5605, 7391, 6383, 5659, 6666, 7980, 7396, 6818, 5581, 6203, 5062, 5724, 5865, 5399, 5153, 5719, 5921, 6719, 7559, 7772, 5542, 6428, 5769, 5228, 7415, 6941, 7886, 6345, 7207, 5808, 6345, 6760, 5105, 7523, 7856, 6027, 5688, 6977, 6492, 6196, 5750, 7978, 5663, 7310, 5152, 6143, 7561, 6525, 5925, 7989, 5882, 7349, 5778, 6906, 6996, 5280, 5727, 7124, 5262, 6866, 7927, 6589, 7121, 6899, 7806, 6029, 5490, 6174, 6392, 7240, 7355, 5852, 6176, 6900, 5818, 7090, 5082, 5957, 6650, 7211, 6031, 5781, 7192, 5214, 5205, 7003, 7680, 7961, 5517, 6026, 6315, 5842, 7815, 5860, 6049, 7245, 6196, 7946, 6763, 7486, 6296, 7192, 5557, 6361, 5641, 5486, 6087, 5758, 5137, 7359, 5288, 5156, 7403, 6466, 5528, 5124, 6074, 7962, 7059, 5194, 6293, 6698, 5765, 5754, 5441, 7560, 5499, 6789, 6705, 5050, 6834, 5475, 5335, 6526, 7797, 5816, 6449, 6257, 7142, 6576, 5914, 6696, 7878, 5889, 5292, 7030, 6196, 5956, 6932, 6275, 5549, 5282, 5193, 6787, 7486, 7862, 5340, 6157, 5897, 5733, 5929, 7058, 6639, 6207, 6563, 5607, 6939, 6979, 6586, 6363, 7780, 7236, 7761, 7992, 5335, 5651, 6133, 7147, 6719, 5004, 5193, 6972, 5671, 5915, 6030, 7040, 6397, 5938, 6516, 5373, 7595, 7950, 6604, 7551, 7722, 7467, 5587, 5632, 5828, 7161, 7636, 7957, 6706, 7467, 7152, 7532, 5846, 7741, 6395, 6982, 5555, 5024, 6462, 7641, 7729, 6938, 5074, 5546, 7116, 7757, 6700, 7649, 7479, 6175, 7334, 7670, 7819, 7681, 7771, 6529, 5837, 6868, 5439, 5317, 5047, 5390, 5827, 6215, 6349, 6576, 5185, 5758, 5555, 7033, 7596, 7214, 6239, 5864, 7592, 7742, 7349, 6321, 7359, 7360, 5348, 6971, 5065, 7548, 6194, 6590, 7172, 5616, 5172, 7186, 5511, 5723, 6631, 6637, 5669, 7638, 6777, 5532, 5596, 7067, 6169, 6849, 7527, 6497, 5113, 6138, 6135, 7157, 6047, 5848, 7449, 5786, 5021, 5417, 7313, 7497, 6725, 6667, 5241, 6007, 6929, 7926, 6202, 6080, 7002, 7197, 7336, 7944, 7050, 5512, 7808, 6926, 5409, 7394, 6834, 6450, 6581, 5156, 7582, 5913, 6295, 6503, 6926, 5833, 7205, 5574, 6133, 6948, 6739, 6292, 6265, 7765, 6892, 6506, 6610, 6290, 7199, 7031, 6645, 7413, 7816, 6279, 5938, 6597, 5560, 7733, 5060, 7216, 6871, 7025, 6917, 5976, 6966, 7884, 5000, 7492, 6110, 5674, 6857, 7131, 7592, 5667, 7559, 5807, 6091, 6600, 6246, 5380, 7276, 6429, 6701, 7805, 5941, 5527, 6643, 5140, 7640, 7876, 7781, 7903, 7639, 6077, 6778, 7151, 7113, 7251, 5143, 7063, 7820, 5081, 6554, 5516, 5012, 7494, 5412, 6564, 6105, 6521, 5443, 7372, 6575, 6121, 6781, 7454, 5755, 7715, 6469, 7734, 6605, 5319, 7423, 7111, 7150, 7141, 7739, 5833, 5121, 7513, 5846, 6122, 7405, 5993, 6268, 6001, 7179, 6389, 7786, 6380, 5115, 6361, 6527, 6909, 7748, 5129, 6965, 6106, 7036, 6639, 5949, 7727, 5314, 7344, 6838, 7218, 7203, 7548, 5349, 6507, 7602, 7963, 7124, 6239, 5788, 6888, 5989, 5843, 5558, 6059, 5748, 6671, 6707, 6884, 6720, 5628, 6527, 5383, 7519, 7520, 5754, 7761, 6459, 5458, 5241, 5062, 7617, 7405, 5808, 6902, 5924, 6996, 6042, 7754, 5773, 7443, 6362, 5729, 6377, 7351, 6491, 7220, 5682, 5828, 5426, 6163, 6810, 5288, 6253, 5073, 6023, 7802, 7568, 6287, 7815, 6813, 6926, 5209, 5163, 6439, 5624, 5593, 7078, 5457, 5201, 7142, 6381, 7444, 6357, 6922, 5240, 6316, 6525, 5264, 5215, 6877, 6083, 5970, 5562, 7638, 6142, 7763, 7261, 5504, 6057, 7994, 6622, 7537, 5193, 5694, 5509, 6201, 5126, 7062, 6015, 5139, 7259, 6462, 6081, 7596, 6953, 5008, 6761, 5203, 7501, 6690, 5926, 7877, 7805, 6918, 6882, 6043, 5310, 5243, 6841, 6466, 6718, 5803, 7382, 5297, 6110, 7894, 6886, 6972, 5541, 5813, 5570, 7872, 5711, 5864, 7058, 7619, 6148, 5123, 7467, 6086, 5386, 7264, 5781, 5080, 6837, 7346, 6727, 7862, 7547, 6145, 5587, 5403, 6707, 5113, 7334, 6495, 5691, 5697, 6045, 6452, 6526, 6183, 5993, 5319, 7020, 5798, 5806, 7064, 7377, 5197, 6962, 7330, 6862, 6946, 7333, 5839, 6102, 5963, 7772, 6567, 5834, 5293, 6668, 7258, 5326, 7875, 6062, 6823, 5367, 5302, 5325, 5555, 5592, 5850, 6485, 6981, 5008, 5244, 7137, 7534, 7874, 5907, 7399, 7035, 7657, 7562, 5660, 6255, 7500, 5236, 7823, 5618, 6624, 7822, 7478, 7283, 6271, 6415, 6847, 5582, 7186, 6765, 5472, 5925, 7292, 7104, 7494, 5935, 7010, 6699, 5934, 6647, 5789, 6376, 7707, 7217, 7631);
        ArrayList<Integer> ansArr = new ArrayList<Integer>();
        int maximum = Integer.MIN_VALUE;
        for (int i:A){
            if(maximum<i)
                maximum = i;
        }
        for (int i:A){
            int ans = 1;
            while (i>1) {
                int x = spf.get(i);
                int count = 0;
                while (i % x == 0) {
                    i /= x;
                    count++;
                }
                ans = ans*(count+1);
            }
            ansArr.add(ans);
        }
        System.out.println(ansArr);

    }
}