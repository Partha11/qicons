package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.H2: ImageVector
    get() {
        if (_H2 != null) {
            return _H2!!
        }
        _H2 = ImageVector.Builder(
            name = "Outlined.H2",
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
                moveTo(21.75f, 19.5f)
                horizontalLineTo(16.5f)
                verticalLineToRelative(-1.609f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.244f, -2.012f)
                lineToRelative(2.89f, -1.445f)
                curveToRelative(0.651f, -0.326f, 1.116f, -0.955f, 1.116f, -1.683f)
                curveToRelative(0f, -0.498f, -0.04f, -0.987f, -0.118f, -1.463f)
                curveToRelative(-0.135f, -0.825f, -0.835f, -1.422f, -1.668f, -1.489f)
                arcToRelative(15.202f, 15.202f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.464f, 0.12f)
                moveTo(2.243f, 4.492f)
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

        return _H2!!
    }

@Suppress("ObjectPropertyName")
private var _H2: ImageVector? = null
