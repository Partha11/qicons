package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Users: ImageVector
    get() {
        if (_Users != null) {
            return _Users!!
        }
        _Users = ImageVector.Builder(
            name = "Outlined.Users",
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
                moveTo(15f, 19.128f)
                arcToRelative(9.38f, 9.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.625f, 0.372f)
                arcToRelative(9.337f, 9.337f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.121f, -0.952f)
                arcToRelative(4.125f, 4.125f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.533f, -2.493f)
                moveTo(15f, 19.128f)
                verticalLineToRelative(-0.003f)
                curveToRelative(0f, -1.113f, -0.285f, -2.16f, -0.786f, -3.07f)
                moveTo(15f, 19.128f)
                verticalLineToRelative(0.106f)
                arcTo(12.318f, 12.318f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.624f, 21f)
                curveToRelative(-2.331f, 0f, -4.512f, -0.645f, -6.374f, -1.766f)
                lineToRelative(-0.001f, -0.109f)
                arcToRelative(6.375f, 6.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.964f, -3.07f)
                moveTo(12f, 6.375f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.75f, 0f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 0f)
                close()
                moveTo(20.25f, 8.625f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.25f, 0f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, 0f)
                close()
            }
        }.build()

        return _Users!!
    }

@Suppress("ObjectPropertyName")
private var _Users: ImageVector? = null
