package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.H3: ImageVector
    get() {
        if (_H3 != null) {
            return _H3!!
        }
        _H3 = ImageVector.Builder(
            name = "Outlined.H3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.905f, 14.626f)
                arcToRelative(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.738f, 3.603f)
                curveToRelative(-0.154f, 0.695f, -0.794f, 1.143f, -1.504f, 1.208f)
                arcToRelative(15.194f, 15.194f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.639f, -0.104f)
                moveToRelative(4.405f, -4.707f)
                arcToRelative(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.738f, -3.603f)
                curveToRelative(-0.154f, -0.696f, -0.794f, -1.144f, -1.504f, -1.209f)
                arcToRelative(15.19f, 15.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.639f, 0.104f)
                moveToRelative(4.405f, 4.708f)
                horizontalLineTo(18f)
                moveTo(2.243f, 4.493f)
                verticalLineToRelative(7.5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(7.502f)
                moveToRelative(0f, -7.501f)
                horizontalLineToRelative(10.5f)
                moveToRelative(0f, -7.5f)
                verticalLineToRelative(7.5f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(7.501f)
            }
        }.build()

        return _H3!!
    }

@Suppress("ObjectPropertyName")
private var _H3: ImageVector? = null
