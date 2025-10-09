package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Divide: ImageVector
    get() {
        if (_Divide != null) {
            return _Divide!!
        }
        _Divide = ImageVector.Builder(
            name = "Outlined.Divide",
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
                moveTo(4.499f, 11.998f)
                horizontalLineToRelative(15f)
                moveToRelative(-7.5f, -6.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(12.374f, 5.248f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(12f, 18.751f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.007f)
                lineTo(12f, 18.758f)
                verticalLineToRelative(-0.007f)
                close()
                moveTo(12.375f, 18.751f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
            }
        }.build()

        return _Divide!!
    }

@Suppress("ObjectPropertyName")
private var _Divide: ImageVector? = null
